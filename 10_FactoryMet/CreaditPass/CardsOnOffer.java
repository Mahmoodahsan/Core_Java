package hatd_parts;


public class CardsOnOffer
{
	public static CardType getOfferCard(Customer cust) {
		
		int creditPoint = cust.getCreditPoints();
		
		if (creditPoint >=100 && creditPoint<500) {
			return new CardType(cust, "Silver");
		}
		
		else if (creditPoint>=501 && creditPoint<1000) {
			return new CardType(cust, "Gold");
		}
		else if (creditPoint>1000) {
			return new CardType(cust, "Platinum");
		}
		else {
			return new CardType(cust, "EMI");
		}
	}
}