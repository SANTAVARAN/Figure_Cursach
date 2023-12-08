package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(0, 1), Arrays.asList(1, 1), Arrays.asList(1, 0)));
        Square squareTest1 = new Square(coordinatesTest1);
        squareTest1.isCoordinatesCorrect();
        double resultTest1 = squareTest1.getArea();
        Assertions.assertEquals(resultTest1, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1), Arrays.asList(2, 0)));
        Square squareTest2 = new Square(coordinatesTest2);
        squareTest2.isCoordinatesCorrect();
        double resultTest2 = squareTest2.getArea();
        Assertions.assertEquals(resultTest2, resultTest2);
    }
}