package com.tproject.TProject.repository;

import com.tproject.TProject.domain.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    @Override
    public List<City> findAll();

    @Override
    public Optional<City> findById(Long id);

    @Override
    City save(City City);

    @Override
    public void deleteById(Long id);

    @Override
    long count();

    @Query(nativeQuery = true)
    List<City> retriveAllQuestionCitys(@Param("ID") int questionId);
}

