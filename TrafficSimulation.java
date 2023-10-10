class CarSimulation implements Runnable {
    private String carName;

    public CarSimulation(String name) {
        this.carName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(carName + " is moving at step " + i);
            try {
                Thread.sleep(100); // Simulate car movement
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(carName + " has reached its destination.");
    }
}

public class TrafficSimulation {
    public static void main(String[] args) {
        Thread car1 = new Thread(new CarSimulation("Car A"));
        Thread car2 = new Thread(new CarSimulation("Car B"));
        Thread car3 = new Thread(new CarSimulation("Car C"));

        // Set different priorities for the car threads
        car1.setPriority(Thread.MAX_PRIORITY); // Highest priority
        car2.setPriority(Thread.NORM_PRIORITY); // Normal priority (default)
        car3.setPriority(Thread.MIN_PRIORITY); // Lowest priority

        car1.start();
        car2.start();
        car3.start();
    }
}
