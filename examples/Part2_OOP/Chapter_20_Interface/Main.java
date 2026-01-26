public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.move();
        car.stop();
    }
}

interface Movable {
    void move();
}

interface Stoppable {
    void stop();
}

class Car implements Movable, Stoppable {
    void start() {
        System.out.println("Car started.");
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}
