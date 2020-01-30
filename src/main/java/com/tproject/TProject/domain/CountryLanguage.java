package com.tproject.TProject.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedNativeQuery(
        name = "CountryLanguage.retriveCountryLanguageByCode",
        query = "SELECT * FROM COUNTRY_LANGUAGE WHERE COUNTRY_CODE = :USERCODE ",
        resultClass = CountryLanguage.class
)


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COUNTRY_LANGUAGE")
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "LANGUAGE_ID", unique = true)
    private Long id;

    @Column(name = "COUNTRY_CODE")
    private String country_code;

    @Column(name = "LANGUAGE")
    private String language;

    @Column(name = "IS_OFFICIAL")
    private Boolean isOfficial;

    @Column(name = "PERCENTAGE")
    private Double percentage;

}
