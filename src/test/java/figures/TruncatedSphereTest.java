package figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TruncatedSphereTest {
    @Test
    @DisplayName("Check figure validity")
    public void isCoordinatesCorrect() {
        ArrayList<List<Integer>> coordinatesTest1 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 2), Arrays.asList(0, 0, 0), Arrays.asList(0, 3, 3)));
        TruncatedSphere truncatedSphereTest1 = new TruncatedSphere(coordinatesTest1);
        truncatedSphereTest1.isCoordinatesCorrect();
        double resultTest1 = truncatedSphereTest1.getArea();
        Assertions.assertEquals(resultTest1, resultTest1);

        ArrayList<List<Integer>> coordinatesTest2 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 1), Arrays.asList(2, 1)));
        TruncatedSphere truncatedSphereTest2 = new TruncatedSphere(coordinatesTest2);
        truncatedSphereTest2.isCoordinatesCorrect();
        double resultTest2 = truncatedSphereTest2.getArea();
        Assertions.assertEquals(resultTest2, resultTest2);

        ArrayList<List<Integer>> coordinatesTest3 = new ArrayList<>(Arrays.asList(Arrays.asList(0, 0, 2), Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 4)));
        TruncatedSphere truncatedSphereTest3 = new TruncatedSphere(coordinatesTest3);
        truncatedSphereTest3.isCoordinatesCorrect();
        double resultTest3 = truncatedSphereTest3.getArea();
        Assertions.assertEquals(resultTest3, resultTest3);
    }
}