package com.tproject.TProject.repository;

import com.tproject.TProject.domain.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

    @Override
    public List<Country> findAll();

    @Override
    public Optional<Country> findById(Long id);

    @Override
    Country save(Country Country);

    @Override
    public void deleteById(Long id);

    @Override
    long count();

    @Query(nativeQuery = true)
    Optional<Country> retriveCountryShortInfoByCode(@Param("USERCODE") String userCode);
}