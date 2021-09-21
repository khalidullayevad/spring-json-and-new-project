package com.example.project.controllers;

import com.example.project.services.AddTwoHoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class AddTwoHoursController {
    @Autowired
    AddTwoHoursService addTwoHoursService;
    @RequestMapping("/addTwoHours/{date}")
    public String addTwoHours(@PathVariable String date) throws ParseException {

        SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date parseDate = formatter.parse(date);
        String newDate = addTwoHoursService.getDateTwoHorusLate(parseDate).toString();

        return  newDate ;
    }
}
