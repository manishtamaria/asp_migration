package com.tamaria.aaspatal.core.pojo;

import lombok.Data;

import javax.persistence.OneToOne;

@Data
public class Clinic {
    private Long id;
    private String name;
    private Integer type;  //0:virtual 1:real
    private Double lat;
    private Double lng;
    @OneToOne
    private Address address;

//
//    -record(clinic,{id :: integer(),
//            type :: integer(), % 0:Virtual 1:Real
//        time :: list(), % clinic time is different than doctor availability time
//        lat = 0.0 :: float(),
//                lng = 0.0 :: float(),
//                name_text_id :: integer(),
//                address_text_id :: integer()
//    }
//       ).

}
