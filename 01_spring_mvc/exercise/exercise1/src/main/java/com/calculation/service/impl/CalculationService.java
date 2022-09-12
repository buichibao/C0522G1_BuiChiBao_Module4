package com.calculation.service.impl;

import com.calculation.service.ICalculationService;
import org.springframework.stereotype.Service;

@Service

public class CalculationService implements ICalculationService {
    @Override
    public double convert(double number) {
        return number * 23000;
    }
}
