package com.tamaria.aaspatal.core.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClinicService {
    private Long id;
    private Long memberId;
    private Integer amount;
    private Boolean paid;
    private LocalDate createdAt;


//    %---- Service (Bill) -----
//            -record(service,{id :: integer(),
//            member_id :: binary(),
//            amount = 0.0 :: float(),
//            paid = 0 :: integer(),
//            created :: integer(),%--- Will Be Bill Time ---
//            patient_id :: binary()
//    }
//       ).
}
