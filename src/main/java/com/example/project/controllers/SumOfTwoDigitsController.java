package com.example.project.controllers;

import com.example.project.services.SumOfTwoDigitsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumOfTwoDigitsController {
    @Autowired
    SumOfTwoDigitsService sumOfTwoDigitsService;
//    @RequestMapping("/getSum/{a}/{b}")
//    public String getSum(@PathVariable int a,@PathVariable int b  ){
//        int sum = sumOfTwoDigitsService.getSum(a,b);
//        return a +"+"+b +"=" +sum;
//
//    }

    @GetMapping
    @RequestMapping("/getSum/{a}/{b}")
    public ResponseEntity<JsonNode> get(@PathVariable int a,@PathVariable int b  )throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        int sum = sumOfTwoDigitsService.getSum(a,b);
        JsonNode json = mapper.readTree("{\"status\": \"ok\", \"data\": \""+sum+"\", \"error\": null}");
        return ResponseEntity.ok(json);
    }
}
