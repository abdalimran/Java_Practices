package imran.java.prog_177;

import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<IPair> list = new ArrayList();
		
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				IPair obj=new IPair(i,j);
				list.add(obj);
			}
		}
		
		for(IPair i:list)
			System.out.println(i.toString());
		
		boolean flag=false;
		IPair obj=new IPair(3,4);
		for(IPair i:list)
		{
			if(i.equals(obj))
			{
				i.toString();
				flag=true;
				break;
			}
		}
		if(flag==true)
			System.out.println("There is a pair for "+obj.toString());
		else
			System.out.println("There is no pair for "+obj.toString());
	}

}
