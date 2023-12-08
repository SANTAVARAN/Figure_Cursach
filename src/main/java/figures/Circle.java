package figures;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Figure {
    public ArrayList<List<Integer>> Points;
    public Circle(ArrayList<List<Integer>> coords) {
        this.Points = coords;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 2 || Points.get(0).equals(Points.get(1))) {
            System.out.println("The figure is invalid");
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
            double square = this.PI * Math.pow(Math.sqrt(X + Y), 2);
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
            double perimeter = 2.0 * this.PI * Math.sqrt(X + Y);
            System.out.printf("The figure perimeter %.2f\n", perimeter);
            return perimeter;
        }
        return 0;
    }
}
