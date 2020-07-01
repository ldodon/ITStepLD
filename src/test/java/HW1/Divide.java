package HW1;

import com.itstep.DivideWithZeroException;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Divide {


    public double divide(double numberToBeDivided, double divisor) throws DivideWithZeroException {
        if (numberToBeDivided > divisor && divisor > 0) {
            return (numberToBeDivided / divisor);
        }

        if (divisor == 0.0) {
            throw new DivideWithZeroException();

        }
        return 0;

    }

    @Test
    @Order(1)
    @DisplayName("Test with positive case for divide of numbers")
    public void positivetestWithDivide() {
        double div = divide(20,2);
        Assertions.assertEquals(10, div);
    }

    @ParameterizedTest
    @DisplayName("Test with negative cases for divide of numbers")
    @CsvSource(value = {"-11, 2", "1,12"})
    public void negativeTestMultiplyNumber(int first, int second) throws DivideWithZeroException {
        Assertions.assertEquals(0, divide(first, second));
    }

    @Test
    public void testWithThrowException() throws DivideWithZeroException {
        Assertions.assertThrows(DivideWithZeroException.class, () -> divide(2, 0));

    }

}

