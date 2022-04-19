package com.tamaria.aaspatal.core.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClinicImageType {
    FRONT(1),
    EXTERIOR(2),
    INTERIOR(3);
    private int type;
}
