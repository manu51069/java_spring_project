package classRoomModules;

public class Conductor {
	Tickets issues(Money m) {
		return new Tickets();
	}
	
	public static void main(String[] args) {
		Conductor c=new  Conductor();
		Money m=new Money();
		Tickets t=new Tickets();
		c.issues(m);
	}
}
class Tickets{}
class Money{}
