
public class MoneyBackFactory extends CardFactory {
	@Override
	public CreditCard CreateProduct() {
		return new MoneyBack();
	}
	
	

}
