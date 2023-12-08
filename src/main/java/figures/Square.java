package figures;

import java.util.ArrayList;
import java.util.List;

public class Square extends Figure {
    public ArrayList<List<Integer>> Points;
    public Square(ArrayList<List<Integer>> coords) {
        this.Points = coords;
    }

    private boolean isSquareCorrect() {
        double lastDist, curDist;
        double x = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
        double y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
        lastDist = Math.sqrt(x + y);
        for (int k = 0; k < 4; ++k) { // Перебор точек
            if (k != 3) {
                double X = Math.pow(this.Points.get(k + 1).get(0) - this.Points.get(k).get(0), 2);
                double Y = Math.pow(this.Points.get(k + 1).get(1) - this.Points.get(k).get(1), 2);
                curDist = Math.sqrt(X + Y);
            } else {
                double X = Math.pow(this.Points.get(0).get(0) - this.Points.get(k).get(0), 2);
                double Y = Math.pow(this.Points.get(0).get(1) - this.Points.get(k).get(1), 2);
                curDist = Math.sqrt(X + Y);
            }
            if (curDist != lastDist) {
                return false;
            }
            lastDist = curDist;
        }
        return true;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 4 || !isSquareCorrect()) {
            System.out.println("The figyre is invalid");
            this.isFigureValid = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public double getArea() {
        if (this.isFigureValid) {
            double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
            double Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
            double square = Math.pow(Math.sqrt(X + Y), 2);
            System.out.printf("The figure area %.2f\n", square);
            return square;
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (this.isFigureValid) {
            double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
            double Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
            double perimeter = 4.0 * Math.sqrt(X + Y);
            System.out.printf("The figure perimeter %.2f\n", perimeter);
            return perimeter;
        }
        return 0;
    }
}
