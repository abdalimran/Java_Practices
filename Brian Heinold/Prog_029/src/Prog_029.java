import java.util.Random;

public class Prog_029 
{
	public static void main(String[] args) 
	{
		Random rand=new Random();
		
		int x=rand.nextInt((50-1)+1)+1;  //((max-min)+1)+min
		int y=rand.nextInt((5-2)+1)+2;
		
		System.out.println(x+"^"+y+" is = "+Math.pow(x,y));
	}

}