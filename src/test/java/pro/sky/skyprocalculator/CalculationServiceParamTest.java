package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculationServiceParamTest {
    private CalculationService out = new CalculationServiceImpl();

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForPlusTests")
    public void shouldReturnPlus(int num1, int num2, int expected) {
        int result = out.plus(num1, num2);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> ProvideArgumentsForPlusTests() {
        return Stream.of(
          Arguments.of(4, 4, 8),
          Arguments.of(3, 2 ,5)
        );
    }

    @ParameterizedTest
    @MethodSource({"ProvideArgumentsForMultiplyTests"})
    public void shouldReturnMultiply(int num1, int num2, int expected) {
        int result = out.multiply(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> ProvideArgumentsForMultiplyTests() {
        return Stream.of(
                Arguments.of(4,4,16),
                Arguments.of(3,2,6)
        );
    }

    @ParameterizedTest
    @MethodSource("ProvideArgumentsForMinusTests")
    public void shouldReturnMinus(int num1, int num2, int expected) {
        int result = out.minus(num1, num2);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> ProvideArgumentsForMinusTests() {
        return Stream.of(
                Arguments.of(7, 4, 3),
                Arguments.of(3, 2 ,1)
        );
    }

    @ParameterizedTest
    @MethodSource({"ProvideArgumentsForDivideTests"})
    public void shouldReturnDivide(int num1, int num2, int expected) {
        int result = out.divide(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> ProvideArgumentsForDivideTests() {
        return Stream.of(
                Arguments.of(4, 4, 1),
                Arguments.of(4, 2, 2)
        );
    }

}
