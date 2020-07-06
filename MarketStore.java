/**
 * Represents a market store.
 * Has cards available for the current purchase.
 */
public class MarketStore {
    private int turnover;
    private int purchaseValue;
    private Card card;

    /**
     * Constructor for the market store.
     *
     * @param turnover      the turnover of the client for the previous month
     * @param purchaseValue the price of the current purchase
     * @param cardType      the card selected for payment
     */
    public MarketStore(int turnover, int purchaseValue, String cardType) throws NotValidTypeException {
        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
        this.card = new CardFactory().getCard(turnover, purchaseValue, cardType);
    }

    /**
     * A method that returns a formatted output:
     * Turnover, Purchase value, Discount rate, Discount and Total.
     */
    public void getOutput() {
        double discountRate = card.getDiscountRate();
        double totalPrice = purchaseValue * (100.0 - discountRate) / 100.0;
        System.out.println("Turnover: $" + formatTo2Digits(turnover));
        System.out.println("Purchase value: $" + formatTo2Digits(purchaseValue));
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Discount: $" + formatTo2Digits(card.calculateDiscount()));
        System.out.println("Total: $" + formatTo2Digits(totalPrice));
    }

    public static void main(String[] args) throws Exception {
        MarketStore market;
        int turnover = 150;
        int purchaseValue = 150;
        market = new MarketStore(turnover, purchaseValue, "Bronze");
        market.getOutput();

        turnover = 600;
        purchaseValue = 850;
        market = new MarketStore(turnover, purchaseValue, "Silver");
        market.getOutput();

        turnover = 1500;
        purchaseValue = 1300;
        market = new MarketStore(turnover, purchaseValue, "Gold");
        market.getOutput();
    }

    private String formatTo2Digits(double x) {
        return String.format("%.2f", x);
    }
}

