public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {
        class Thread1 extends Thread {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1 - Count: " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


        class Thread2 extends Thread {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2 - Count: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread1.join();

        thread2.start();
        thread2.join();

        System.out.println("Main thread completes.");
    }
}
