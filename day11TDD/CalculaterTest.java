import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator cal;


        @BeforeEach
        public void setup() {
            cal = new Calculator();

        }


        @Test
        public void fivePlusThreeEqualsEight() {
            //Calculator cal=new Calculator();
            Double answer = cal.add(5, 3);
            double correctanswer = 8;
            Assertions.assertEquals(answer, correctanswer);
        }

        @Test
        public void fivePluszeroEqualsFive() {
            //Calculator cal = new Calculator();
            Double answer = cal.add(5, 0);
            double correctanswer = 5;
            Assertions.assertEquals(answer, correctanswer);
        }

    @Test
    public void fiveminusThreeEqualsTwo() {
        //Calculator cal = new Calculator();
        Double answer = cal.sub(5, 3);
        double correctanswer = 2;
        Assertions.assertEquals(answer, correctanswer);
    }
    @Test
    public void fiveminusTenEqualsMinusFive() {
        //Calculator cal = new Calculator();
        Double answer = cal.sub(5, 10);
        double correctanswer = -5;
        Assertions.assertEquals(answer, correctanswer);
    }
    @Test
    public void tendivideTenEqualsZero() {
        //Calculator cal = new Calculator();
        Double answer = cal.sub(10, 10);
        double correctanswer = 0;
        Assertions.assertEquals(answer, correctanswer);
    }
    @Test
    public void throExceptionWhenDivideByeZero() {
        //Calculator cal = new Calculator();

        Assertions.assertThrows(ArithmeticException.class, () -> cal.div(10,0));
    }
}