abstract class Persistance
{
	abstract void persist();
	
}
class PersisFact
{
	//PersisFact f=new PersisFact();
	public static Persistance getPersistance()
	{
		return new FilePersistance();
	}
}

class FilePersistance extends Persistance
{
	public void persist()
	{
		System.out.println("data persisted into file");
	}
}

class DbPersistance extends Persistance
{
	public void persist()
	{
		System.out.println("data persisted into databse");
	}
}

public class Client
{
	public static void main(String args [])
	{
	
	Persistance p=PersisFact.getPersistance();
	p.persist();
	}
}
