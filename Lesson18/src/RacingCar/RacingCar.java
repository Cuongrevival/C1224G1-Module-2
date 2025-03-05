package RacingCar;

import java.util.Random;

import static RacingCar.Main.DISTANCE;
import static RacingCar.Main.STEPS;

public class RacingCar implements Runnable {
    private String carName;

    public RacingCar(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance < DISTANCE) {
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percent = runDistance * 100 / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEPS) {
                    if (percent >= i + STEPS) {
                        log += "=";
                    } else if (percent >= i && percent < i + STEPS) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println(carName + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + carName + " is broken.");
                break;
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Car: " + carName + " finished at " + (endTime - startTime) / 1000 + " s");
    }
}
