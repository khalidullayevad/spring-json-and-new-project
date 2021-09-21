package com.example.project.services.impl;

import com.example.project.services.SumOfTwoDigitsService;
import org.springframework.stereotype.Service;

@Service
public class SumOfTwoDigitsServiceImpl implements SumOfTwoDigitsService {

    @Override
    public int getSum(int a, int b) {
        return a + b;
    }
}
