package com.tproject.TProject.controllers;

import com.tproject.TProject.config.DatabaseException;
import com.tproject.TProject.config.NotFoundCodeException;
import com.tproject.TProject.domain.*;
import com.tproject.TProject.service.DbService;
import org.hibernate.exception.JDBCConnectionException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.web.bind.annotation.*;

import java.net.ConnectException;

@RestController
public class MainController {

    @Autowired
    private DbService service;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/{userCode}")
    public Object getCountryShortInfo(@PathVariable String userCode)   throws DatabaseException{
        try {
            return new CountryShortInfoDto(modelMapper.map(service.getCountryShortInfoByCode(userCode).orElseThrow(NotFoundCodeException::new), CountryDto.class),
                    modelMapper.map(service.getCountryLanguageByCode(userCode).orElseThrow(NotFoundCodeException::new), CountryLanguageDto.class));
        } catch (NotFoundCodeException e) {
            return e.getMessage();
        }

    }
}
