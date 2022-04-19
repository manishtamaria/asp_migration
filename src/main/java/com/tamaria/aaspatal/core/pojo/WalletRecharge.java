package com.tamaria.aaspatal.core.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class WalletRecharge {
    private Long id;
    private Long memberId;
    private Integer amount;
    private LocalDate createdAt;

//    -record(recharge,{ id :: integer(),
//            member_id :: binary(),
//            amount :: integer(),
//            status = 0 :: integer(),
//            created = time_util:utc_seconds() :: integer()
//    }
//       ).
}
