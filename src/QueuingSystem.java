package pagibig.queue;

public class QueuingSystem {
    private static volatile QueuingSystem instance;
    private int currentQueueNumber;

    private QueuingSystem() {
        this.currentQueueNumber = 0; // Starts at 0
    }

    public static QueuingSystem getInstance() {
        if (instance == null) {
            synchronized (QueuingSystem.class) {
                if (instance == null) {
                    instance = new QueuingSystem();
                }
            }
        }
        return instance;
    }

    public synchronized int getNextQueueNumber() {
        return ++currentQueueNumber;
    }

    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public synchronized void resetQueueNumber(int newNumber) {
        if (newNumber >= 0) {
            this.currentQueueNumber = newNumber;
            System.out.println("\n[SYSTEM ALERT] Queue has been manually reset to: " + newNumber + "\n");
        } else {
            System.out.println("[ERROR] Invalid queue number. Cannot reset to a negative value.");
        }
    }
}
