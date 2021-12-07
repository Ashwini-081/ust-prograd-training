import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void checkAreaIsTwelveWhenLengthIsFourAndWidththIsThree(){
        Rectangle rec=new Rectangle();
        int answer=rec.area(3,4);
        int correctanswer=12;
        Assertions.assertEquals(answer,correctanswer);
    }
    @Test
    public void checkPerimeterIsFourteenWhenLengthIsFourAndWidththIsThree(){
        Rectangle rec=new Rectangle();
        int answer=rec.perimeter(3,4);
        int correctanswer=14;
        Assertions.assertEquals(answer,correctanswer);
    }

}