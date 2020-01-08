public class Main {
    public static void main(String[] args) {
        Vehicle[] carsAndTrains = new Vehicle[5];
        carsAndTrains[0] = new Car(1111, Car.carTypes.TOYOTA);
        carsAndTrains[1] = new Train(2222, 20);
        carsAndTrains[2] = new Car(3333, Car.carTypes.MAZDA);
        carsAndTrains[3] = new Train(4444, 40);
        carsAndTrains[4] = new Car(5555, Car.carTypes.CITROEN);

        for(int i = 0; i < carsAndTrains.length; i++) {
            System.out.println(carsAndTrains[i].printInfo());
        }

    }
}
