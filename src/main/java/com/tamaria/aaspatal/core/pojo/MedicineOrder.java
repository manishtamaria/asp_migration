package com.tamaria.aaspatal.core.pojo;

import com.tamaria.aaspatal.core.enums.OrderStatus;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Data
public class MedicineOrder {
    private Long id;
    private Long memberId;
    @ManyToOne
    private Address address;
    @OneToMany
    private List<Medicine> medicines;
    private Integer amount;
    private OrderStatus status;
    private String trackingId;
    private LocalDate createdAt;

//    %---- Medicine Order ----
//            -record(order,{id :: integer(),
//            member_id :: binary(),
//            address_id = 0 :: integer(),
//            medicine :: list(), % list of maps having medicine data (price/per total price medicine etc)
//        amount = 0 :: integer(),
//                status = 0 :: integer(), % 0:PaymentPending 1:Paid 2:Dispatched 3:OutForDelivery 4:Delivered
//        tracking_id :: binary(),
//                created = time_util:utc_seconds()
//    }
//      ).
}
