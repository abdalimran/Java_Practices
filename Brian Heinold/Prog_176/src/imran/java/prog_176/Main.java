package imran.java.prog_176;

public class Main 
{
	public static void main(String[] args) 
	{
		IPair a=new IPair(1,8);
		IPair b=new IPair(3,5);
		IPair c=new IPair(1,8);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		System.out.println(a.equals(b)); //Equality testing method-1
		System.out.println(a.hashCode()==c.hashCode()); //Equality testing method-2
	}

}
