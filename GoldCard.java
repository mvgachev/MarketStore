/**
 * Represents a golden discount card.
 * Extends the {@link Card} class
 */
public class GoldCard extends Card {

    public GoldCard(int turnover, int purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public double getDiscountRate() {
        return Math.min(2.0 + (double) turnover / 100.0, 10.0);
    }
}
