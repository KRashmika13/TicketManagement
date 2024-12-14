//public class Main {
//    public static void main(String[] args) {
//        try {
//            // Configuration setup
//            Configuration config = CommandLineInterface.configureSystem();
//            TicketPool ticketPool = new TicketPool();
//
//            // Create threads for vendor and customer
//            Thread vendor = new Thread(new Vendor(ticketPool, config.getTicketReleaseRate()));
//            Thread customer = new Thread(new Customer(new PriorityRetrieval(ticketPool))); // Specify a retrieval strategy
//
//            vendor.start();
//            customer.start();
//
//            // Wait for threads to finish
//            vendor.join();
//            customer.join();
//
//        } catch (InterruptedException e) {
//            Logger.log("Main thread interrupted.");
//        } catch (Exception e) {
//            Logger.log("Error during system execution: " + e.getMessage());
//        } finally {
//            Logger.log("System terminated.");
//        }
//    }
//}
