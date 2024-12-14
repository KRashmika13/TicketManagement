////public class Vendor extends AbstractTicketHandler implements Runnable {
////    private final int ticketReleaseRate;
////    public Vendor(TicketPool ticketPool, int ticketReleaseRate) {
////        super(ticketPool);
////        this.ticketReleaseRate = ticketReleaseRate;
////    }
////    @Override public void run() {
////        for (int i = 0; i < ticketReleaseRate; i++) {
////            String ticket = "Ticket-" + System.nanoTime();
////            ticketPool.addTickets(ticket);
////            Logger.log("Vendor added: " + ticket);
////
////            try { Thread.sleep(500);
////            } catch (InterruptedException e) {
////                Logger.log("Vendor interrupted.");
////            }
////        }
////    }
////    @Override
////    public void handleTickets() {
////        run();
////    }
////}
//
//public class Vendor extends Thread {
//    private final TicketPool ticketPool;
//    private final int ticketReleaseRate;
//
//    public Vendor(TicketPool ticketPool, int ticketReleaseRate) {
//        this.ticketPool = ticketPool;
//        this.ticketReleaseRate = ticketReleaseRate;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < ticketReleaseRate; i++) {
//            String ticket = "TICKET-" + System.nanoTime();
//            ticketPool.addTickets(ticket);
//            Logger.log("Vendor added: " + ticket);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                Logger.log("Vendor interrupted.");
//                break;
//            }
//        }
//    }
//}
