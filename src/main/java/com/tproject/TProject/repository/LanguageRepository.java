package com.tproject.TProject.repository;

import com.tproject.TProject.domain.Country;
import com.tproject.TProject.domain.CountryLanguage;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LanguageRepository extends CrudRepository<CountryLanguage, Long> {

    @Override
    public List<CountryLanguage> findAll();

    @Override
    public Optional<CountryLanguage> findById(Long id);

    @Override
    CountryLanguage save(CountryLanguage CountryLanguage);

    @Override
    public void deleteById(Long id);

    @Override
    long count();

    @Query(nativeQuery = true)
    Optional<CountryLanguage> retriveCountryLanguageByCode(@Param("USERCODE") String userCode);
}
