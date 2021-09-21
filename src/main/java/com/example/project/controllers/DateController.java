package com.example.project.controllers;

import com.example.project.entities.Response;
import com.example.project.services.CurrentDateService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateController {

    @Autowired
    private CurrentDateService currentDateService;
//
//    @RequestMapping("/getDate")
//    public String getString()
//    {
//        return  "Current date: "+currentDateService.getCurrentDate().toString();
//    }

    @GetMapping
    @RequestMapping("/getDate")
    public Response get() throws JsonProcessingException {
        String date = currentDateService.getCurrentDate().toString();
        Response response = new Response();
        response.setData(date);
        response.setStatus("ok");
        return response;
    }
}
