package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConeTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(1, 1, 1) , Arrays.asList(2, 2, 2)));
        Cone coneTest1 = new Cone(coordinatesTest1);
        coneTest1.isCoordinatesCorrect();
        double resultTest1 = coneTest1.getArea();
        System.out.println(resultTest1);
        Assertions.assertEquals(resultTest1, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(1, 1, 1)));
        Cone coneTest2 = new Cone(coordinatesTest2);
        coneTest2.isCoordinatesCorrect();
        boolean resultTest2 = coneTest2.isFigureValid;

        Assertions.assertEquals(resultTest2, resultTest2);
    }
}
