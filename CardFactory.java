public class CardFactory {

    public Card getCard(int turnover, int purchaseValue, String cardType) throws NotValidTypeException {
        switch (cardType) {
            case "Bronze":
                return new BronzeCard(turnover, purchaseValue);
            case "Silver":
                return new SilverCard(turnover, purchaseValue);
            case "Gold":
                return new GoldCard(turnover, purchaseValue);
            default:
                throw new NotValidTypeException("The type of this card is unknown to the Store.");
        }
    }
}
