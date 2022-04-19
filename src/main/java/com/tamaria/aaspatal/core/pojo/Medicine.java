package com.tamaria.aaspatal.core.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Medicine {
    private Long id;
    private String brand;
    private String salt;
    private String type;
    private String content;
    private LocalDate expiry;
    private Float unitMrp;
    private Integer dosePerUnit;
    private Boolean allowedByNurse;
    private LocalDate updatedAt;

//    %---- Medicine Inventory ----
//            -record(medicine,{id :: integer(),
//            brand :: binary(),
//            salt :: binary(),
//            type :: binary(),
//            content :: binary(),
//            expiry :: binary(),
//            unit_mrp :: float(),
//            dose_per_unit :: integer(),
//            allowed = 1 :: integer(), %--- allowed by nurse to prescribe ---
//            updated_at = time_util:utc_seconds() :: integer()
//    }
//      ).

}
