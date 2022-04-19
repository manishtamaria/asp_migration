package com.tamaria.aaspatal.core.pojo;

import lombok.Data;

import java.util.List;

@Data
public class ClinicDoctor {
    private Long id;
    private Long doctorId;
    private Long clinicId;
    private Integer fee;
//    slot in min
    private Integer slot;
    private Integer advanceHours;
//    %[1,2,3,4,5,6,7] Starting From Monday = 1
    private List<Integer> availableDays;
//    %[<<"10:30-14:00">>,<<"17:00-20:30">>] 24hrs clock
    private List<String> availableTimes;


//    -record(clinic_doctor,{ id :: integer(),
//            clinic_id :: integer(),
//            doctor_id :: integer(),
//            fee :: integer(), % in rupee
//        slot :: integer(), % in minutes
//        advance_hrs :: integer(), % in hours
//        available_days :: list(), %[1,2,3,4,5,6,7] Starting From Monday = 1
//        available_times :: list(), %[<<"10:30-14:00">>,<<"17:00-20:30">>] 24hrs clock
//        unavailable_times :: list() % list of utc seconds
//    }
//       ).
}
