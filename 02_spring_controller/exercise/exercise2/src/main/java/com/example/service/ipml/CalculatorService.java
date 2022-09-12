package com.example.service.ipml;

import com.example.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public String convert(String number1, String number2, String opera) {
        try {
            double a = Double.parseDouble(number1);
            double b = Double.parseDouble(number2);
            double result = 0;
            switch (opera){
                case "add":
                    result = a + b;
                    break;
                case "sub":
                    result = a - b;
                    break;
                case "mul":
                    result = a * b;
                    break;
                case "div":
                    if(b == 0){
                        return "division by 0";
                    }
                    result = a / b;
                    break;
            }
            return String.valueOf(result);
        }catch (NumberFormatException e){
            return "wrong format";
        }
    }

}
