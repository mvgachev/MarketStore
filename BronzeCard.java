/**
 * Represents a bronze discount card.
 * Extends the {@link Card} class
 */
public class BronzeCard extends Card {

    public BronzeCard(int turnover, int purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public double getDiscountRate() {
        if (turnover < 100) {
            return 0.0;
        } else if (turnover <= 300) {
            return 1.0;
        }
        return 2.5;
    }
}
