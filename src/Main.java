public class Main {

    public static void main(String[] args) {

        Driver a1 = new Driver("Max.V", "M033");
        Driver a2 = new Driver("Nursultan", "001AAA");
        Driver a3 = new Driver("Damir", "090DAM");

        Vehicle car1 = new Car("Lexus LX570", 2022, 4, "Petrol");
        Vehicle car2 = new Car("Red Bull25", 2025, 0, "Petrol");
        Vehicle bike = new Motorcycle("Kawasaki Ninja H2", 2019, false);
        Vehicle truck = new Truck("Volvo", 2018, 12.5, 6);

        car1.setDriver(a2);
        bike.setDriver(a1);
        truck.setDriver(a3);
        car2.setDriver(a1);

        Vehicle[] vehicles = {car1, car2, bike, truck};

        for (int i=0; i < vehicles.length; i++) {
            Vehicle s = vehicles[i];
            s.startEngine();
            s.displayInfo();
            s.stopEngine();
            System.out.println();
        }
    }
}