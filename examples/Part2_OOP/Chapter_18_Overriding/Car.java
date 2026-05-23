public class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("Car drives fast.");
    }

    public void run(int speed) {
        System.out.println("Car drives at " + speed + " km/h.");
    }

    public void callSuperRun() {
        super.run();
        this.run();
    }
}
