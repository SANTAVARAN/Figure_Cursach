package figures;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Figure {
    public ArrayList<List<Integer>> Points;
    public Polygon(ArrayList<List<Integer>> coords) {
        this.Points = coords;
    }

    private boolean isPolygonCorrect() {
        for (int i = 0; i < Points.size() - 1; ++i) {
            if (Points.get(i).equals(Points.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (!isPolygonCorrect() || Points.size() < 3) {
            System.out.println("The figure is invalid");
            this.isFigureValid = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public double getArea() {
        if (isFigureValid) {
            double firstSum = 0, secSum = 0;
            for (int i = 0; i < Points.size() - 1; ++i) {
                firstSum += Points.get(i).get(0) * Points.get(i + 1).get(1);
                secSum += Points.get(i + 1).get(0) * Points.get(i).get(1);
            }
            double square = 0.5 * Math.abs(firstSum +
                    Points.get(Points.size() - 1).get(0) * Points.get(0).get(1)
                    - secSum - Points.get(0).get(0) * Points.get(Points.size() - 1).get(1));
            System.out.printf("The figure area %.2f\n", square);
            return square;
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (isFigureValid) {
            double perimeter = 0;
            for (int k = 0; k < Points.size() - 1; ++k) {
                double X = Math.pow(this.Points.get(k + 1).get(0) - this.Points.get(k).get(0), 2),
                        Y = Math.pow(this.Points.get(k + 1).get(1) - this.Points.get(k).get(1), 2),
                        sideSize = Math.sqrt(X + Y);
                perimeter += sideSize;
            }
            double X = Math.pow(this.Points.get(0).get(0) - this.Points.get(Points.size() - 1).get(0), 2),
                    Y = Math.pow(this.Points.get(0).get(1) - this.Points.get(Points.size() - 1).get(1), 2),
                    sideSize = Math.sqrt(X + Y);
            perimeter += sideSize;
            System.out.printf("The figure perimeter %.2f\n", perimeter);
            return perimeter;
        }
        return 0;
    }
}
