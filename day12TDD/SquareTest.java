import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;

    @Test
    public void checkSideIsNegativeOrZero() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-4));
    }

    @Nested
    class AreaTest {

        @Test
        public void checkAreaIsTwentyFiveWhenSideIsFive() {
            Square square = new Square(5);
            double actualArea = square.area();
            double expectedArea = 25;
            assertEquals(expectedArea, actualArea);
        }

        @Nested
        class PerimeterTest {

            @Test
            public void checkPerimeterIsTwentyFiveWhenSideIsFive() {
                Square square = new Square(5);
                double actualPerimeter = square.perimeter();
                double expectedPerimeter = 20;
                assertEquals(expectedPerimeter, actualPerimeter);
            }
        }

    }
}