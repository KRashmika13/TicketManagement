////import java.util.Collections;
////import java.util.LinkedList;
////import java.util.List;
////
////public class TicketPool implements TicketOperation {
////    private final List<String> tickets = Collections.synchronizedList(new LinkedList<>());
////    @Override
////    public synchronized void addTickets(String ticket) {
////        tickets.add(ticket);
////    }
////    @Override
////    public synchronized String removeTicket() {
////        return tickets.isEmpty() ? null : tickets.remove(0);
////    }
////    public int getTicketCount() {
////        return tickets.size();
////    }
////}
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class TicketPool {
//    private final List<String> tickets = new LinkedList<>();
//    private int ticketsAdded = 0;
//    private int ticketsRemoved = 0;
//
//    public synchronized void addTickets(String ticket) {
//        tickets.add(ticket);
//        ticketsAdded++;
//        Logger.logTicketOperation("ADD", ticket);
//    }
//
//    public synchronized String removeTicket() {
//        if (tickets.isEmpty()) {
//            return null;
//        }
//        String ticket = tickets.remove(0);
//        ticketsRemoved++;
//        Logger.logTicketOperation("REMOVE", ticket);
//        return ticket;
//    }
//
//    public synchronized String getTicketById(String id) {
//        for (String ticket : tickets) {
//            if (ticket.equals(id)) {
//                tickets.remove(ticket);
//                ticketsRemoved++;
//                Logger.logTicketOperation("REMOVE", ticket);
//                return ticket;
//            }
//        }
//        return null;
//    }
//
//    public synchronized List<String> getAllTickets() {
//        return new LinkedList<>(tickets);
//    }
//
//    public synchronized int getTicketCount() {
//        return tickets.size();
//    }
//
//    public synchronized int getTicketsAdded() {
//        return ticketsAdded;
//    }
//
//    public synchronized int getTicketsRemoved() {
//        return ticketsRemoved;
//    }
//}
