import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Divide {

//   @ParameterizedTest(name = "{index} => numberToBeDivided={0}, divisor={1}, quotient={2}")
//    @CsvSource( {"1, 3, 3"});

    public double divisionFunction(double numberToBeDivided, double divisor) {
        if (divisor == 0.0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0");

        } else {
            return (numberToBeDivided / divisor);
        }
    }

}
