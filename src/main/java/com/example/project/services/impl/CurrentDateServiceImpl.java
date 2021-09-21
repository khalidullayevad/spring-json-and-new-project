package com.example.project.services.impl;

import com.example.project.services.CurrentDateService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CurrentDateServiceImpl implements CurrentDateService {
    @Override
    public Date getCurrentDate() {
        Date currentDate = new Date();
        return currentDate;
    }
}
