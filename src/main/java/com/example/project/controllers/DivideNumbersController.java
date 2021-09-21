package com.example.project.controllers;


import com.example.project.entities.Response;
import com.example.project.services.DivideNumdersService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivideNumbersController {
    @Autowired
    DivideNumdersService divideNumbersService;

    @GetMapping("/divide/{a}/{b}")
    public Response divide(@PathVariable int a, @PathVariable int b ) {
        Response response = new Response();
        if( b!= 0) {
            double sum = divideNumbersService.delete(a, b);

            response.setData(""+sum);
        }
        else{
            response.setError("Cannot divide by zero");
        }

        response.setStatus("ok");

        return response;
    }

}
