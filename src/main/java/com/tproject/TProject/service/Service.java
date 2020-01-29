package com.tproject.TProject.service;

import com.tproject.TProject.domain.City;
import com.tproject.TProject.domain.Country;
import com.tproject.TProject.domain.CountryLanguage;
import com.tproject.TProject.repository.CityRepository;
import com.tproject.TProject.repository.CountryLanguageRepository;
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
    private CountryLanguageRepository countryLanguageRepository;

    public List<City> getAllCitys() {

        return cityRepository.findAll();
    }

   // public List<City> getAllCountryCitys(int id) {
     //   return cityRepository.retriveAllCountryCitys(id);
    //}

    public Optional<City> getCity(Long id) {

        return cityRepository.findById(id);
    }

    public City saveCity(final City City) {
        return cityRepository.save(City);
    }

    public void deleteCity(Long id) {
        cityRepository.deleteById(id);
    }


    public List<Country> getAllCountrys() {

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

        return countryLanguageRepository.findAll();
    }

    public Optional<CountryLanguage> getCountryLanguage(Long id) {

        return countryLanguageRepository.findById(id);
    }

    public CountryLanguage saveCountryLanguage(final CountryLanguage CountryLanguage) {
        return countryLanguageRepository.save(CountryLanguage);
    }

    public void deleteCountryLanguage(Long id) {
        countryLanguageRepository.deleteById(id);
    }


}