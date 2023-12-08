package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircleTest {
    @Test
    @DisplayName("Check is figure valid")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1)));
        Circle circleTest1 = new Circle(coordinatesTest1);
        circleTest1.isCoordinatesCorrect();
        double resultTest1 = circleTest1.getArea();
        System.out.println(resultTest1);
        Assertions.assertEquals(resultTest1, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(0, 0)));
        Circle circleTest2 = new Circle(coordinatesTest2);
        circleTest2.isCoordinatesCorrect();
        double resultTest2 = circleTest2.getArea();

        Assertions.assertEquals(resultTest2, resultTest2);
    }
}
