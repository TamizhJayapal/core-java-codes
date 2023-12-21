public class ThreadInterruptExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
//                    if (Thread.interrupted()) {
//                        System.out.println("Thread isInterrupted. Exiting gracefully.");
//                        return;
//                    }

                    System.out.println("Working... " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        });

        myThread.start();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        myThread.interrupt();
    }
}
