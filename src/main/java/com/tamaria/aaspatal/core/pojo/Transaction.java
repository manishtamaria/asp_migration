package com.tamaria.aaspatal.core.pojo;

import com.tamaria.aaspatal.core.enums.TransactionType;

import java.time.LocalDate;

public class Transaction {
    private Long id;
    private Long payerId;
    private Integer amount;
    private TransactionType type;
    private Boolean paid;
    private LocalDate createdAt;
}
