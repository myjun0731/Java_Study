public class Main {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(5), new Rectangle(4, 6) };
        for (Shape shape : shapes) {
            shape.printInfo();
        }
    }
}

abstract class Shape {
    public abstract double area();

    public void printInfo() {
        System.out.println(getClass().getSimpleName() + "의 넓이: " + area());
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
