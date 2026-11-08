package pagibig.queue;

public class HelpDesk {
    private final int deskId;
    private final QueuingSystem queueSystem;

    public HelpDesk(int deskId) {
        this.deskId = deskId;
        this.queueSystem = QueuingSystem.getInstance(); 
    }

    public void serveNextCustomer() {
        int nextNumber = queueSystem.getNextQueueNumber();
        System.out.println("Help Desk Station " + deskId + " is now serving Queue Number: " + nextNumber);
    }

    public void displayCurrentStatus() {
        System.out.println("Online Monitor Viewer -> Current Queued Number: " + queueSystem.getCurrentQueueNumber());
    }

    public void manualReset(int newNumber) {
        System.out.println("Help Desk Station " + deskId + " initiated a system reset request...");
        queueSystem.resetQueueNumber(newNumber);
    }
}
