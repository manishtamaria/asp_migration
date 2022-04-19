package com.tamaria.aaspatal.core.service;

import com.tamaria.aaspatal.core.exceptions.TcplWebSocketException;
import com.tamaria.aaspatal.core.mappers.TcplResponseMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class TcplLiveService {
    private TcplWebSocketClient webSocketClient;
    private TcplResponseMapper tcplResponseMapper;

    @SneakyThrows
    @PostConstruct
    public void initClient()  {
        try {
            webSocketClient = new TcplWebSocketClient(new URI( "wss://aaspatal.live/cmsws" ));
            webSocketClient.connect();
            Thread.sleep(2000);
        } catch (URISyntaxException e) {
            throw new TcplWebSocketException(e.getMessage());
        }
    }

    public void sendRequest(String request){
        webSocketClient.send(request);
    }

    @Async
    public CompletableFuture<String> callAsycService(String request) throws InterruptedException {
        webSocketClient.send(request);
        Thread.sleep(500);
        String response = getResponse();
//        PatientVisit visit = getPatientVisit(response);
        return CompletableFuture.completedFuture(response);
    }

    public String  getResponse(){
        return webSocketClient.getTcplResponse().getResponse();

    }

    public boolean isOpen(){
        return webSocketClient.isOpen();
    }

    public boolean isClosed(){
        return webSocketClient.isClosed();
    }
}
