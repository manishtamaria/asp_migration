package com.tamaria.aaspatal.core.pojo;

import java.time.LocalDate;

public class Wallet {
    private Long  id;
    private Long memberId;
    private Integer amount;
    private LocalDate  createdAt;
    private Integer balance;

//    -record(wallet,{ id :: integer(),
//            member_id :: binary(),
//            purpose_type :: integer(), % purpose type may have either integer or binary purpose id (ex: for appointment, integer for other binary)
//        purpose_intid = 0 :: integer(),
//                purpose_binid = <<>> :: binary(),
//                amount :: integer(), % in rupee
//        type :: integer(), % 1:credit 0:debit
//                created = time_util:utc_seconds() :: integer()
//    }
//       ).
}
