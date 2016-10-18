abstract class Persistance
{
	void persist();
	
}
class PersisFact
{
	public Persistance getPersistance()
	{
		return FilePersistance f;
	}
}

class FilePersistence extends Persistance
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
	Persistance p=new Persistance();
	p=PersisFact.getPersistance();
	}
}
