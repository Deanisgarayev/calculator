package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationServiceTest {

    private CalculationService out = new CalculationServiceImpl();


    @Test
    public void ShouldBeEqualTenWhenFivePlusFive() {
        int result = out.plus(5,5);
        assertEquals(10, result);
    }
    @Test
    public void ShouldBeEqualZeroWhenFiveMinusFive() {
        int result = out.minus(5,5);
        assertEquals(0, result);
    }
    @Test
    public void ShouldBeEqualTwentyFiveWhenFiveMultiplyFive() {
        int result = out.multiply(5,5);
        assertEquals(25, result);
    }
    @Test
    public void ShouldBeEqualOneWhenFiveDivideFive() {
        int result = out.divide(5,5);
        assertEquals(1, result);
    }

    @Test
    public void shouldTrowIllegalArgumentExceptionWhenOneOfNumEqualZero() {
        assertThrows(IllegalArgumentException.class,
                () -> out.divide(0, 0));
    }
}

