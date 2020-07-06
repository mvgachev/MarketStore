/**
 * Represents a silver discount card.
 * Extends the {@link Card} class.
 */
public class SilverCard extends Card {

    public SilverCard(int turnover, int purchaseValue) {
        super(turnover, purchaseValue);
    }

    @Override
    public double getDiscountRate() {
        if (turnover > 300) return 3.5;
        else return 2.0;
    }
}
