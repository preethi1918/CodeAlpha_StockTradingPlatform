import java.util.ArrayList;

public class Portfolio {
    double balance;
    // We will keep a list of stocks we bought
    ArrayList<Stock> ownedStocks;

    public Portfolio(double startingBalance) {
        this.balance = startingBalance;
        this.ownedStocks = new ArrayList<>();
    }

    public void showPortfolio() {
        System.out.println("Current Balance: $" + balance);
        System.out.println("Stocks Owned: " + ownedStocks.size());
    }
}