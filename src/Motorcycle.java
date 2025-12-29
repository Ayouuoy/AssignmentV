public class Motorcycle extends Vehicle {

    private boolean hasSidecar;
    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }
    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
