package com.tproject.TProject.controller;

import com.tproject.TProject.config.DatabaseException;
import com.tproject.TProject.config.NotFoundCodeException;
import com.tproject.TProject.controllers.MainController;
import com.tproject.TProject.domain.CountryDto;
import com.tproject.TProject.service.DbService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ModelMapper modelMapper;

    @MockBean
    private DbService service;

    @Test
    public void shouldThrowErrorWhenUserPutWrongCountryCode() throws NotFoundCodeException {
        try {
        //Given
        String userCode = "xxx";
        when(service.getCountryShortInfoByCode(userCode)).thenReturn(Optional.empty());
        when(modelMapper.map(service.getCountryShortInfoByCode(userCode).orElseThrow(NotFoundCodeException::new), CountryDto.class)).thenThrow(NotFoundCodeException.class);

        //When & Then

            mockMvc.perform(get("/xxx").contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().is5xxServerError());
        }
        catch (NotFoundCodeException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void shouldThrowErrorWhendatabaseIsDown(){
        try {
            //Given
            String userCode = "xxx";
            when(service.getCountryShortInfoByCode(userCode)).thenReturn(Optional.empty());
            when(modelMapper.map(service.getCountryShortInfoByCode(userCode).orElseThrow(NotFoundCodeException::new), CountryDto.class)).thenThrow(NotFoundCodeException.class);

            //When & Then

            mockMvc.perform(get("/xxx").contentType(MediaType.APPLICATION_JSON))
                    .andExpect(status().is5xxServerError());
        }
        catch (DatabaseException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}