package com.example.service.ipml;

import com.example.service.IConvertService;
import org.springframework.stereotype.Service;

@Service
public class ConvertService implements IConvertService {
    @Override
    public double convertMoney(double usd) {
        return usd*23000;
    }
}
