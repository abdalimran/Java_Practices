package imran.java.practice;

public class Anonymous_Object 
{
	private String h="Hello Anonymous!";
	
	public void Hello()
	{
		System.out.println(h);
	}

	public static void main(String[] args) 
	{
		new Anonymous_Object().Hello();
	}
}
