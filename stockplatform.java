import java.util.Scanner;

public class StockPlatform {
    public static void main(String[] args) {
        // 1. Setup
        Scanner input = new Scanner(System.in);
        Portfolio myPortfolio = new Portfolio(1000.0); // Start with $1000
        
        // 2. The Loop
        boolean running = true;
        while (running) {
            System.out.println("\n1. View Balance\n2. Buy Stock\n3. Exit");
            int choice = input.nextInt();

            if (choice == 1) {
                myPortfolio.showPortfolio();
            } else if (choice == 3) {
                running = false;
                System.out.println("Goodbye!");
            }
            // Logic for 'Buy' goes here!
        }
    }
}