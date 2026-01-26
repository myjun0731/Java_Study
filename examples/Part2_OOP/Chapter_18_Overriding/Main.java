public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        ColorPrinter colorPrinter = new ColorPrinter();

        printer.print("Hello");
        colorPrinter.print("Hello in color");
        colorPrinter.print("Hello", "Blue");
    }
}

class Printer {
    void print(String message) {
        System.out.println("Printing: " + message);
    }
}

class ColorPrinter extends Printer {
    @Override
    void print(String message) {
        System.out.println("Color printing: " + message);
    }

    void print(String message, String color) {
        System.out.println("Color printing: " + message + " in " + color);
    }
}
