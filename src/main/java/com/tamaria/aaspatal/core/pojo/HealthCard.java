package com.tamaria.aaspatal.core.pojo;

import com.tamaria.aaspatal.core.enums.Language;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class HealthCard {
    private Long id;
    private Language language;
    private String title;
    private String color;
    private Boolean active;
    private List<String> servicces;
    private Integer cost;
    private Integer value;
    private LocalDate validity;


//    -record(health_card,{sub_id :: integer(),
//            id :: integer(),
//            lang :: integer(),
//            title :: binary(),
//            color :: integer(),
//            active :: integer(), % 1:active 0:inactive
//        service :: list(), % list of integer service
//        cost :: integer(), % charges to be paid in rupee
//        value :: integer(), % value, a patient will receive in rupee
//        validity :: integer() % in days
//    }
//      ).
}
