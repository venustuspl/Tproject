package com.tproject.TProject.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {

    private Long id;
    private String code;
    private String name;
    private String continent;
    private String region;
    private Double surface_area;
    private Integer indep_year;
    private Long population;
    private Double life_expectancy;
    private Double gnp;
    private Double gnp_old;
    private String local_name;
    private String government_form;
    private String head_of_state;
    private Integer capital;
    private String code2;

}
