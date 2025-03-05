package RacingCar;

public class Main {
    public static int DISTANCE = 100;
    public static int STEPS = 2;
    public static void main(String[] args) {
        RacingCar car1 = new RacingCar("Car A");
        RacingCar car2 = new RacingCar("Car B");
        RacingCar car3 = new RacingCar("Car C");
        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);
        System.out.println("Distance 100km");
        t1.start();
        t2.start();
        t3.start();
    }
}
