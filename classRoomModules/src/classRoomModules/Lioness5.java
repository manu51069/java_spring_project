package classRoomModules;

class Lioness5 
{
	

	Milk gives(Meat m,Water w) 
	{
	return new Milk();
	}

	public static void main(String[] args)
	{
		Lioness5 l=new Lioness5();
		Meat m=new Meat();
		Water w=new Water();
		l.gives(m, w);
	}
}

class Milk{}
class Water{}
class Meat{}
