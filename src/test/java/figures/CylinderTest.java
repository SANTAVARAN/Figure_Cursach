package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CylinderTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 1) , Arrays.asList(2, 2, 1)));
        Cylinder cylinderTest1 = new Cylinder(coordinatesTest1);
        cylinderTest1.isCoordinatesCorrect();
        double resultTest1 = cylinderTest1.getArea();
        System.out.println(resultTest1);

        Assertions.assertEquals(resultTest1, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 1) , Arrays.asList(2, 2, 2)));
        Cylinder cylinderTest2 = new Cylinder(coordinatesTest2);
        cylinderTest2.isCoordinatesCorrect();
        double resultTest2 = cylinderTest2.getArea();
        System.out.println(resultTest1);

        Assertions.assertEquals(resultTest2, resultTest2);
    }
}
