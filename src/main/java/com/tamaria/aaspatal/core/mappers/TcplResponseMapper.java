package com.tamaria.aaspatal.core.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tamaria.clinic.dashbaord.pojo.ClinicData;
import com.tamaria.clinic.dashbaord.pojo.MedicinesData;
import com.tamaria.clinic.dashbaord.pojo.PatientVisit;
import com.tamaria.clinic.dashbaord.pojo.api.ClinicStatResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TcplResponseMapper {
    private  ObjectMapper objectMapper;

    public TcplResponseMapper(){
        this.objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public ClinicData getClinics(String response){
        try {
            return objectMapper.readValue(response, ClinicData.class);
        } catch (JsonProcessingException e) {
            log.error("Unable to parse response, {}", e.getMessage());
        }
        return null;
    }

    public ClinicStatResponse getClinicStat(String response) {
        try {
            return objectMapper.readValue(response,ClinicStatResponse.class);
        } catch (JsonProcessingException e) {
            log.error("Unable to parse response, {}", e.getMessage());
        }
        return null;
    }

    public MedicinesData getMedicineInventory(String  response){
        try {
            return objectMapper.readValue(response,MedicinesData.class);
        } catch (JsonProcessingException e) {
            log.error("Unable to parse response, {}", e.getMessage());
        }
        return null;
    }

    public PatientVisit getPatientVisit(String response){
        try {
            return objectMapper.readValue(response,PatientVisit.class);
        } catch (JsonProcessingException e) {
            log.error("Unable to parse response, {}", e.getMessage());
        }
        return null;
    }

}
