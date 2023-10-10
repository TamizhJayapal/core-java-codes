class WorkerThread implements Runnable {
    private String name;

    public WorkerThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name + " is working.");
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                System.out.println(name + " was interrupted.");
                return;
            }
        }
    }
}

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup taskGroup = new ThreadGroup("TaskGroup");

        // Create and start worker threads in the task group
        Thread thread1 = new Thread(taskGroup, new WorkerThread("Thread 1"));
        Thread thread2 = new Thread(taskGroup, new WorkerThread("Thread 2"));
        Thread thread3 = new Thread(taskGroup, new WorkerThread("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();

        // Simulate the application running for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop all threads in the task group by interrupting them
        taskGroup.interrupt();
    }
}
