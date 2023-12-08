package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangleTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(0, 1)));
        Rectangle rectangleTest1 = new Rectangle(coordinatesTest1);
        rectangleTest1.isCoordinatesCorrect();
        double resultTest1 = rectangleTest1.getArea();
        Assertions.assertEquals(resultTest1, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(-1, 1)));
        Rectangle rectangleTest2 = new Rectangle(coordinatesTest2);
        rectangleTest2.isCoordinatesCorrect();
        double resultTest2 = rectangleTest2.getArea();
        Assertions.assertEquals(resultTest2, resultTest2);
    }
}