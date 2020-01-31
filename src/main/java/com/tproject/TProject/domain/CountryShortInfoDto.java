package com.tproject.TProject.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CountryShortInfoDto {

    private String name;
    private String continent;
    private Integer population;
    private Double life_expectancy;
    private String country_language;


    public CountryShortInfoDto(CountryDto country, CountryLanguageDto countryLanguage) {
        this.name = country.getName();
        this.continent = country.getContinent();
        this.population = country.getPopulation();
        this.life_expectancy = country.getLife_expectancy();
        this.country_language = countryLanguage.getLanguage();
    }


}
