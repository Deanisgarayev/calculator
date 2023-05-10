package pro.sky.skyprocalculator;

public interface CalculationService {
    String plusNumber(String num1, String num2);
    Integer plus(Integer num1, Integer num2);
    String minusNumber(String num1, String num2);
    Integer minus(Integer num1, Integer num2);

    String multiplyNumber(String num1, String num2);

    Integer multiply(Integer num1, Integer num2);

    String divideNumber(String num1, String num2);

    Integer divide(Integer num1, Integer num2);
}
