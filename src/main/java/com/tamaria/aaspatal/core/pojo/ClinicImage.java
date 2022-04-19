package com.tamaria.aaspatal.core.pojo;

import com.tamaria.aaspatal.core.enums.ClinicImageType;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class ClinicImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private ClinicImageType type;

}
