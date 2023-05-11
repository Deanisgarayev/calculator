package pro.sky.skyprocalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/calculator")
public class CalculationController {
    private final CalculationService calculationService;

    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;

    }

    @GetMapping("/welcome")
    public String WelcomeToCalculator() {
        return "Welcome to calculator";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        int result = calculationService.plus(num1, num2);
        return num1 + "+" + num2 + "=" + result;

    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        int result = calculationService.minus(num1, num2);
        return num1 + "-" + num2 + "=" + result;

    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        int result = calculationService.multiply(num1, num2);
        return num1 + "*" + num2 + "=" + result;

    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == 0 || num2 == 0) {
            throw new IllegalArgumentException("We can not divide zero");
        }
        int result = calculationService.divide(num1, num2);
        return num1 + "/" + num2 + "=" + result;
    }
}


