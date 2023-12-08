package figures;

import java.util.ArrayList;
import java.util.List;

public class Cone extends Figure {
    public ArrayList<List<Integer>> Points;
    public Cone(ArrayList<List<Integer>> coords) {
        this.Points = coords;
    }

    @Override
    public void isCoordinatesCorrect() {
        if (Points.size() != 3 || Points.get(0).equals(Points.get(1)) || Points.get(2).equals(Points.get(0))) {
            System.out.println("The figyre is invalid");
            this.isFigureValid = false;
        } else {
            System.out.println("The figure is valid");
        }
    }

    @Override
    public double getArea() {
        if (isFigureValid) {
            double X = Math.pow(this.Points.get(2).get(0) - this.Points.get(1).get(0), 2),
                    Y = Math.pow(this.Points.get(2).get(1) - this.Points.get(1).get(1), 2),
                    Z = Math.pow(this.Points.get(2).get(2) - this.Points.get(1).get(2), 2),
                    l = Math.sqrt(X + Y + Z);
            double vecX = Math.pow(this.Points.get(1).get(0) - this.Points.get(0).get(0), 2),
                    vecY = Math.pow(this.Points.get(1).get(1) - this.Points.get(0).get(1), 2),
                    vecZ = Math.pow(this.Points.get(1).get(2) - this.Points.get(0).get(2), 2),
                    radius = Math.sqrt(vecX + vecY + vecZ), square = PI * radius * l + PI * Math.pow(radius, 2);
            System.out.printf("The figure area %.2f\n", square);
            return square;
        }
        return 0;
    }
}
