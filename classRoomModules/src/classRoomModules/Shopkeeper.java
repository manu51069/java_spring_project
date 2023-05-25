package classRoomModules;

public class Shopkeeper 
{
	Mobile sells(Money m) {
	return new Mobile();
	}
	

	public static void main(String[] args) {
		Shopkeeper s=new Shopkeeper();
		Mobile m=new Mobile();
		Money p=new Money();
		s.sells(p);
	}
	}
class Money{}
