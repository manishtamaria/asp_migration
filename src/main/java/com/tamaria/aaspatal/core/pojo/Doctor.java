package com.tamaria.aaspatal.core.pojo;

import lombok.Data;

@Data
public class Doctor {

    private Long id;
    private String name;
    private String qualification;
    private String speciality;
    private String fmcId;
    private String mobile;



//    name_text_id = 0 :: integer(),
//    email :: binary(),
//    qualification_text_id = 0 :: integer(),
//    speciality_text_id = 0 :: integer(),
//    fcm_id = <<>> :: binary(),
//    mci = <<>> :: binary(),
//    ngo = 0 :: integer(),
//    mobile = <<>> :: binary()
}
