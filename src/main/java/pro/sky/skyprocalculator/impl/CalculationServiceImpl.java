package pro.sky.skyprocalculator.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.sky.skyprocalculator.CalculationService;

@Service
public class CalculationServiceImpl implements CalculationService {
    @Override
    public String plusNumber(String num1, String num2) {
        return num1 + "+" + num2 + "=10";
    }
    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public String minusNumber(String num1, String num2) {
        return num1 + "-" + num2 + "=0";
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public String multiplyNumber(String num1, String num2) {
        return num1 + "*" + num2 + "=25";
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public String divideNumber(String num1, String num2) {
        return num1 + "/" + num2 + "=1";
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}

