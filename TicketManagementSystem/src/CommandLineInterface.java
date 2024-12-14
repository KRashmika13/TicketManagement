//import java.util.Scanner;
//
//public class CommandLineInterface {
//
//    public static Configuration configureSystem() {
//        Scanner scanner = new Scanner(System.in);
//        Logger.log("Starting system configuration...");
//
//        // Gather user inputs
//        int totalTickets = getInput(scanner, "Enter Total Tickets: ");
//        int ticketReleaseRate = getInput(scanner, "Enter Ticket Release Rate: ");
//        int customerRetrievalRate = getInput(scanner, "Enter Customer Retrieval Rate: ");
//        int maxTicketCapacity = getInput(scanner, "Enter Max Ticket Capacity: ");
//
//        Logger.log("System configured successfully.");
//
//        // Return a Configuration object
//        try {
//            return new Configuration(totalTickets, ticketReleaseRate, customerRetrievalRate, maxTicketCapacity);
//        } catch (Exception e) {
//            Logger.log("Error creating configuration: " + e.getMessage());
//            throw new RuntimeException("Configuration failed due to invalid parameters.");
//        }
//    }
//
//    private static int getInput(Scanner scanner, String prompt) {
//        int value;
//        while (true) {
//            System.out.print(prompt);
//            try {
//                value = Integer.parseInt(scanner.nextLine());
//                if (value > 0) {
//                    return value;
//                } else {
//                    System.out.println("Value must be positive. Try again.");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a valid number.");
//            }
//        }
//    }
//}
