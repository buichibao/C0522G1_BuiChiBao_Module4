package com.example.service.ipml;

import com.example.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    @Override
    public String convert(String a, String b, String c) {
        try {
            double number1 = Double.parseDouble(a);
            double number2 = Double.parseDouble(b);
            double result = 0;
            switch (c) {
                case "add":
                    result = number1 + number2;
                    break;
                case "sub":
                    result = number1 - number2;
                    break;
                case "mul":
                    result = number1 * number2;
                    break;
                case "div":
                    if (number2 == 0) {
                        return "Không thể chia cho 0";
                    }
                    result = number1 / number2;
            }
            return String.valueOf(result);
        } catch (NumberFormatException e) {
            return "Please enter Number";
        }
    }

}
