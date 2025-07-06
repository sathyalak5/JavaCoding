abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    @Override //Overriding the area() method from abstract class Shape
    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape s;

        s = new Triangle(5, 5);
        System.out.println("Triangle area: " + s.area());
    }
}
