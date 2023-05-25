
public class Bank {
	double balance;
	Bank(double balance){
		this.balance = balance;
	}
	void login(String user, String pass) {
		if(user.equals("muthu") && pass.equals("muthu")) {
			System.out.println("Welcome Muthu");
			System.out.println("You Account Balance: " + this.balance);
		}
	}
	void login(int mpin) {
		if(mpin == 5678) {
			System.out.println("Welcome Muthu");
			System.out.println("You Account Balance: " + this.balance);
		}
	}
	void login(Card c, int pin) {
		if(pin == 1221) {
			System.out.println("Welcome Muthu");
			System.out.println("You Account Balance: " + this.balance);
		}
	}
	void login(int pin, Card c) {
		if(pin == 1451) {
			System.out.println("Welcome Muthu");
			System.out.println("You Account Balance: " + this.balance);
		}
	}

}


class Card{}