package marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void setThePlateauSize() {
    }

    @Test
    void testSetThePlateauSize() {

        String input = "5 5";
        PlateauSize plateauSize = InputParser.setThePlateauSize(input);
        assertEquals(5, plateauSize.getX());
        assertEquals(5, plateauSize.getY());

        String input1 = "3 3";
        PlateauSize plateauSize1 = InputParser.setThePlateauSize(input1);
        System.out.println(plateauSize1);
        assertEquals(3, plateauSize1.getX());
        assertEquals(3, plateauSize1.getY());

    }

    @Test
    void landingCoordinatePosition() {
        //Arrange

        //ACT

        //ASSERT
       // assertArrayEquals(2,);
    }
}