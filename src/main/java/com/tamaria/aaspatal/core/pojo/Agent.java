package com.tamaria.aaspatal.core.pojo;

import com.tamaria.aaspatal.core.enums.Gender;
import com.tamaria.aaspatal.core.enums.Language;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Agent {
    private Long id;
    private String name;
    private String email;
    private String mobile;
    private Integer age;
    private Gender gender;
    private Language language;
    private String qualification;
    private Integer clinicId;
    private String fmcId;
    private LocalDate createAt;
    private LocalDate updatedAt;



//    -record(agent,{id :: binary(),
//            name_text_id = 0 :: integer(),
//            email :: binary(),
//            mobile = <<>> :: binary(),
//            age = 0 :: integer(),
//            gender = 0 :: integer(),
//            lang = 2 :: integer(),
//            android = 0 :: integer(),
//            qualification = <<>> :: binary(),
//            clinic_id = 0 :: integer(),
//            fcm_id = <<>> :: binary(),
//            actions = #{} :: map(),
//            created = time_util:utc_seconds() :: integer(),
//            updated = time_util:utc_seconds() :: integer()
//    }
//       ).
}
