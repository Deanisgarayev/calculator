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

    @GetMapping("/plusNumber")
    public String plusNumber(@RequestParam String num1, @RequestParam String num2) {
        return calculationService.plusNumber(num1, num2);
    }

    @GetMapping("/plus")
    public Integer plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.plus(num1, num2);

    }

    @GetMapping("/minusNumber")
    public String minusNumber(@RequestParam String num1, @RequestParam String num2) {
        return calculationService.minusNumber(num1, num2);
    }

    @GetMapping("/minus")
    public Integer minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.minus(num1, num2);

    }

    @GetMapping("/multiplyNumber")
    public String multiplyNumber(@RequestParam String num1, @RequestParam String num2) {
        return calculationService.multiplyNumber(num1, num2);
    }

    @GetMapping("/multiply")
    public Integer multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calculationService.multiply(num1, num2);

    }

    @GetMapping("/divideNumber")
    public String divideNumber(@RequestParam String num1, @RequestParam String num2) {
        return calculationService.divideNumber(num1, num2);
    }

    @GetMapping("/divide")
    public Integer divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == 0 || num2 == 0) {
            throw new IllegalArgumentException("We can not divide zero");
        }
        return calculationService.divide(num1, num2);
    }
}


