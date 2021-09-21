package com.example.project.services.impl;

import com.example.project.services.AddTwoHoursService;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class AddTwoHoursServiceImpl implements AddTwoHoursService {
    @Override
    public Date getDateTwoHorusLate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, 2);
        return calendar.getTime();
    }
}
