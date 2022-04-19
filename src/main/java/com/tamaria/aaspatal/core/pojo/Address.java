package com.tamaria.aaspatal.core.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String state;
    private String city;
    private Integer pin;
    private String landmark;
    private  String formattedAddress;



//
//    %----- Addresses ----
//            -record(address,{key :: list(), %--- MemberId/AgentId|AddressId
//        id :: integer(),
//                title :: binary(),
//                country = 0 :: integer(),
//                state = 0 :: integer(),
//                city = 0 :: integer(),
//                pin = 0 :: integer(),
//                text = <<>> :: binary(),
//                landmark = <<>> :: binary(),
//                lat = 0.0 :: float(),
//                lng = 0.0 :: float()
//    }
//      ).
}
