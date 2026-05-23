public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 5),
            new Triangle(6, 4)
        };

        double total = 0;
        for (Shape s : shapes) {
            System.out.printf("%-10s area = %.2f%n", s.getClass().getSimpleName(), s.area());
            total += s.area();
        }
        System.out.printf("total = %.2f%n", total);

        Shape s = shapes[0];
        if (s instanceof Circle c) {
            System.out.println("radius of first: " + c.getRadius());
        }
    }
}
