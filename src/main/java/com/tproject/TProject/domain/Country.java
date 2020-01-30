package com.tproject.TProject.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;



@NamedNativeQuery(
        name = "Country.retriveCountryShortInfoByCode",
        query = "SELECT * FROM COUNTRY WHERE CODE = :USERCODE ",
        resultClass = Country.class
)



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COUNTRY")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "COUNTRY_ID", unique = true)
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CONTINENT")
    private String continent;

    @Column(name = "REGION")
    private String region;

    @Column(name = "SURFACE_AREA")
    private Double surface_area;

    @Column(name = "INDEP_YEAR")
    private Integer indep_year;

    @Column(name = "POPULATION")
    private Integer population;

    @Column(name = "LIFE_EXPECTANCY")
    private Double life_expectancy;

    @Column(name = "GNP")
    private Double gnp;

    @Column(name = "GNP_OLD")
    private Double gnp_old;

    @Column(name = "LOCAL_NAME")
    private String local_name;

    @Column(name = "GOVERNMENT_FORM")
    private String government_form;

    @Column(name = "HEAD_OF_STATE")
    private String head_of_state;

    @Column(name = "CAPITAL")
    private Integer capital;

    @Column(name = "CODE2")
    private String code2;

}
