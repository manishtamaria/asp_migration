package com.tamaria.aaspatal.core.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MedicineStock {
    private Long id;
    private Long clinicId;
    private Long medicineId;
    private Integer  doses;
    private LocalDate updatedAt;


    //              -record(medicine_stock,{key :: list(), %-- clinicId|MedicineId
//        doses :: integer(), %--- available doses ---
//                updated_at = time_util:utc_seconds() :: integer()
//    }
//       ).
}
