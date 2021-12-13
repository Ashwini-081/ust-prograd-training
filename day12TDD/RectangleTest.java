import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    public void checkAreaIsTwelveWhenLengthIsFourAndWidththIsThree() {
        Rectangle rectangle = new Rectangle(3, 4);
        int actualArea = rectangle.perimeter();
        int expectedArea = 14;
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void checkPerimeterIsFourteenWhenLengthIsFourAndWidththIsThree() {
        Rectangle rectangle = new Rectangle(3, 4);
        int actualPerimeter = rectangle.perimeter();
        int expectedPerimeter = 14;
        Assertions.assertEquals(expectedPerimeter, actualPerimeter);

    }
    @Test
    public void throwExceptionWhenLengthAndWidthAreLessThanEqualTOZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-2,3));
    }



}






