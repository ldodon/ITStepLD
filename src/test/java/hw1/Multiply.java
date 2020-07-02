package hw1;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Multiply {

    public double multiply(double firstNumber, double secondNumber) {

        if (firstNumber >= 0 && firstNumber <= 100 && secondNumber >= 0 && secondNumber <= 100) {
            return firstNumber*secondNumber;
        } return 0;
    }


    @Test
    @Order(1)
    @DisplayName("Test with positive case")
    public void testPositive(){

        Assertions.assertEquals(10, multiply(1,10));
    }
    @ParameterizedTest
    @Order(2)
    @DisplayName("Test with negative cases")
    @CsvSource(value={"-11, 2", "1,101","4,-6","140,-12","131,6","-1,102"})
    public void negativeTestMultiplyNumber(double first, double second){
        Assertions.assertEquals(0,multiply(first,second));
    }
}