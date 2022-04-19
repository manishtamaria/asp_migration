package com.tamaria.aaspatal.core.pojo;

import com.tamaria.aaspatal.core.enums.AppointmentStatus;

import java.time.LocalDate;

public class Appointment {
    private Long id;
    private Long memberId;
    private Long doctorId;
    private Long clinicId;
    private LocalDate time;
    private AppointmentStatus status;
    private LocalDate createdAt;
    private Integer fee;
    private Integer feeTaken;
    private Integer feeRemaining;
    private LocalDate paidAt;


//    -record(appointment,{id :: integer(),
//            member_id :: binary(),
//            doctor_id :: binary(),
//            clinic_id :: integer(),
//            time :: integer(), % utc seconds booking time
//        status :: integer(), % 0:payment failed 1:pending payment 2:pending approval 3:confirmed 4:cancelled 5:attended 6:skipped
//                at = time_util:utc_seconds() :: integer(), % created
//        note = <<>> :: binary(),
//                by :: binary(),% created By (Can be same as member id)
//        fee :: integer(),
//                fee_taken :: integer(),
//                fee_remaining :: integer(),
//                paid = 0 :: integer(),
//                paid_at = 0 :: integer()
//    }
//       ).
}
