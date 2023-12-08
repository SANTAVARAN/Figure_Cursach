package figures;

import java.util.ArrayList;
import java.util.List;

public class Parallelogram extends Figure {
    public ArrayList<List<Integer>> Points;
    public Parallelogram(ArrayList<List<Integer>> coords) {
        this.Points = coords;
    }

    private boolean isParallelogramCorrect() {
        double lastDist, curDist, added;
        double x = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
        double y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
        lastDist = Math.sqrt(x + y);
        added = lastDist;
        for (int k = 0; k < 4; ++k) {
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
                added = curDist;
            }
            if (curDist != lastDist && curDist != added && added != lastDist) {
                return false;
            }
            lastDist = curDist;
        }
        return true;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 4 || !isParallelogramCorrect()) {
            System.out.println("The figure is invalid");
            this.isFigureValid = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public double getArea() {
        if (this.isFigureValid) {
            double firstVectorX = Points.get(1).get(0) - Points.get(0).get(0),
                    firstVectorY = Points.get(1).get(1) - Points.get(0).get(1),
                    secondVectorX = Points.get(2).get(0) - Points.get(1).get(0),
                    secondVectorY = Points.get(2).get(1) - Points.get(1).get(1),
                    chiclitel = Math.abs(firstVectorX * secondVectorX + firstVectorY * secondVectorY),
                    znamenatel = Math.sqrt(Math.pow(firstVectorX, 2) + Math.pow(firstVectorY, 2))
                            * Math.sqrt(Math.pow(secondVectorX, 2) + Math.pow(secondVectorY, 2));
            double X = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2);
            double Y = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2);
            double x = Math.pow(this.Points.get(2).get(0) - this.Points.get(1).get(0), 2);
            double y = Math.pow(this.Points.get(2).get(1) - this.Points.get(1).get(1), 2);
            double square = Math.sqrt(X + Y) * Math.sqrt(x + y) * (chiclitel / znamenatel);
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
            double x = Math.pow(this.Points.get(2).get(0) - this.Points.get(1).get(0), 2);
            double y = Math.pow(this.Points.get(2).get(1) - this.Points.get(1).get(1), 2);
            double perimeter = 2 * (Math.sqrt(X + Y) + Math.sqrt(x + y));
            System.out.printf("The figure perimeter %.2f\n", perimeter);
            return perimeter;
        }
        return 0;
    }
}
