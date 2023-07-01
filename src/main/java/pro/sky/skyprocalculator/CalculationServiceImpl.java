package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.sky.skyprocalculator.CalculationService;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }


    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num1 == 0 || num2 == 0) {
            throw new IllegalArgumentException("We can not divide zero");
        }
        return num1 / num2;
    }
}

