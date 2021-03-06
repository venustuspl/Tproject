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
public class CountryLanguageDto {

    private Long id;
    private String country_code;
    private String language;
    private Boolean isOfficial;
    private Double percentage;

}
