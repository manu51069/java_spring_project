import java.util.Scanner;

public class ImplementCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.err.println("enter the card type");
		String cardType=scan.next();
		CreditCard c=CardFactory.getCreditCard(cardType);
		if(c!=null) {
			System.err.println("Card type: "+c.getCreditCardType());
			System.err.println("Card Limit: "+c.getCreditCardLimit());
			System.err.println("Card Annual_Fee "+getCreditCardAnnual_Fee());
		}
	}
}
