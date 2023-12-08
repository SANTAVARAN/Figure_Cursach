package figures;

public class Figure {
    final static double PI = 3.141592;
    public boolean isFigureValid = true;
    public void isCoordinatesCorrect() {
        System.out.println("The figure is figyre");
    }

    public double getArea() {
        System.out.println("The figure has no area");
        return 0;
    }

    public double getPerimeter() {
        System.out.println("The figure has no perimeter");
        return 0;
    }
}