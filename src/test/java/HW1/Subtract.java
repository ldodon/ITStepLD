package HW1;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Subtract {

    public int subtract(int firstNumber, int secondNumber){

        if ( firstNumber> secondNumber && secondNumber >= 0 ) {
            return firstNumber-secondNumber;
        } return -1;
    }
    @Test
    @DisplayName("Test with positive case for subtract of numbers")
    public void positiveTestSubtractNumber(){

        Assertions.assertEquals(10, subtract(20,10));
    }
    @ParameterizedTest
    @DisplayName("Test with negative cases for subtract of numbers")
    @CsvSource(value={"-11, 2", "0,0","4,-6","14,20"})
    public void negativeTestMultiplyNumber(int first, int second){
        Assertions.assertEquals(-1, subtract(first,second));
    }
}
