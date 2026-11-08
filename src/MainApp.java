package pagibig.queue;

public class MainApp {
    public static void main(String[] args) {
        HelpDesk desk1 = new HelpDesk(1);
        HelpDesk desk2 = new HelpDesk(2);
        HelpDesk desk3 = new HelpDesk(3);

        System.out.println("=== Pag-ibig Centralized Queuing Simulation Started ===\n");

        desk1.serveNextCustomer();
        desk2.serveNextCustomer();
        
        desk1.displayCurrentStatus();
        
        desk3.serveNextCustomer();
        desk1.serveNextCustomer();

        desk2.manualReset(50);

        desk3.serveNextCustomer();
        desk1.serveNextCustomer();
        
        desk3.displayCurrentStatus();
    }
}
