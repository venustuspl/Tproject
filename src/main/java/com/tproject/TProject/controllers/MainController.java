package com.tproject.TProject.controllers;

import com.tproject.TProject.domain.*;
import com.tproject.TProject.service.DbService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private DbService service;

    @Autowired
    private ModelMapper modelMapper;

    @RequestMapping(method = RequestMethod.GET, value = "/{userCode}")
    public CountryShortInfoDto getCountryShortInfo(@PathVariable String userCode) throws Exception {

        return new CountryShortInfoDto(modelMapper.map(service.getCountryShortInfoByCode(userCode).orElseThrow(Exception::new),CountryDto.class),
                modelMapper.map(service.getCountryLanguageByCode(userCode).orElseThrow(Exception::new), CountryLanguageDto.class));

    }
}
