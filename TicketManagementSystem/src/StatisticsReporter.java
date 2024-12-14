//public class StatisticsReporter implements Runnable {
//    private final TicketPool ticketPool;
//
//    public StatisticsReporter(TicketPool ticketPool) {
//        this.ticketPool = ticketPool;
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            Logger.log("Statistics: Added=" + ticketPool.getTicketsAdded() +
//                    ", Removed=" + ticketPool.getTicketsRemoved() +
//                    ", Current=" + ticketPool.getTicketCount());
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                Logger.log("Statistics Reporter interrupted.");
//                break;
//            }
//        }
//    }
//}
