package com.example.project.services.impl;

import com.example.project.services.DivideNumdersService;

import org.springframework.stereotype.Service;

@Service
public class DivideNumbersImpl implements DivideNumdersService {
    @Override
    public double delete(int a, int b) {
        return a/b;
    }
}
