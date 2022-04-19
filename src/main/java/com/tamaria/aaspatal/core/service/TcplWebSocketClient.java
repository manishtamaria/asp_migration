package com.tamaria.aaspatal.core.service;

import com.tamaria.aaspatal.core.mappers.TcplResponseMapper;
import com.tamaria.aaspatal.core.models.TcplResponse;
import lombok.extern.slf4j.Slf4j;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.json.JSONObject;

import java.net.URI;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class TcplWebSocketClient extends WebSocketClient {
    private TcplResponse tcplResponse = new TcplResponse();
    private TcplResponseMapper tcplResponseMapper;

    public TcplWebSocketClient(URI serverUri) {
        super(serverUri);
    }

    public TcplResponse getTcplResponse() {
        return tcplResponse;
    }

    @Override
        public void onMessage( String message ) {
        tcplResponse.setResponse(message);

    }

    @Override
    public void onOpen(ServerHandshake handshake ) {
        log.info( "opened connection" );
        Runnable sendPing = () -> {
            log.info("Pinging Web Socket");
            JSONObject obj = new JSONObject();
            obj.put("message_type", 0);
            super.send(obj.toString());
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(sendPing, 0, 20, TimeUnit.SECONDS);
}

    @Override
    public boolean isOpen() {
    return super.isOpen();
}

    @Override
    public void onClose( int code, String reason, boolean remote ) {
    System.out.println( "closed connection" );
}

    @Override
    public void onError( Exception ex ) {
        ex.printStackTrace();
    }


}
