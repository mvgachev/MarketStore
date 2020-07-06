/**
 * Represents a discount card.
 * Has a turnover for the last month.
 * Has a purchase value from the client.
 */
public abstract class Card {
    protected int turnover;
    protected int purchaseValue;

    public Card(int turnover, int purchaseValue) {
        this.turnover = turnover;
        this.purchaseValue = purchaseValue;
    }

    public abstract double getDiscountRate();

    /**
     * Calculates the discount of the purchase given the purchaseValue and discountRate.
     *
     * @return - discount.
     */
    public double calculateDiscount() {
        return purchaseValue * getDiscountRate() / 100;
    }
}
