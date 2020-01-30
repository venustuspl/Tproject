package com.tproject.TProject.service;

import com.tproject.TProject.domain.City;
import com.tproject.TProject.domain.Country;
import com.tproject.TProject.domain.CountryLanguage;
import com.tproject.TProject.repository.CityRepository;
import com.tproject.TProject.repository.LanguageRepository;
import com.tproject.TProject.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private LanguageRepository languageRepository;

    public List<City> getAllCitys() {

        return cityRepository.findAll();
    }

    public Optional<Country> getCountryShortInfoByCode(String code) {
        return countryRepository.retriveCountryShortInfoByCode(code);
    }

    public Optional<City> getCity(Long id) {

        return cityRepository.findById(id);
    }

    public City saveCity(final City City) {
        return cityRepository.save(City);
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }


    public List<Country> getAllCountries() {

        return countryRepository.findAll();
    }

    public Optional<Country> getCountry(Long id) {

        return countryRepository.findById(id);
    }

    public Country saveCountry(final Country Country) {
        return countryRepository.save(Country);
    }

    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }

//CountryLanguages

    public List<CountryLanguage> getAllCountryLanguages() {

        return languageRepository.findAll();
    }

    public Optional<CountryLanguage> getCountryLanguage(Long id) {

        return languageRepository.findById(id);
    }

    public CountryLanguage saveCountryLanguage(final CountryLanguage CountryLanguage) {
        return languageRepository.save(CountryLanguage);
    }

    public void deleteCountryLanguage(Long id) {
        languageRepository.deleteById(id);
    }

    public Optional<CountryLanguage> getCountryLanguageByCode(String code) {
        return languageRepository.retriveCountryLanguageByCode(code);
    }
}