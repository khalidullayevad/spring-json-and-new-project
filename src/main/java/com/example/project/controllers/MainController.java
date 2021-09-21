package com.example.project.controllers;

import com.example.project.entities.Response;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController {


//    @RequestMapping("/")
//    public String getString()
//    {
//        return "Hello World";
//    }
@GetMapping("/")
    public Response sayHello() {

        Response response = new Response();
        response.setData("Hello Worls");
        response.setStatus("ok");


        return response;
        //return new ResponseEntity<>(jsArr.toList(), HttpStatus.OK);
    }


}
