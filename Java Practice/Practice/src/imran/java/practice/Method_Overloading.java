package imran.java.practice;

public class Method_Overloading 
{
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(int a,int b,int c)  //Overloading by changing number of arguments
	{
		System.out.println(a+b+c);
	}
	
	public void sum(double a,double b) //Overloading by changing argument types
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		Method_Overloading obj=new Method_Overloading();
		
		obj.sum(2, 3);
		obj.sum(2,3,4);
		obj.sum(2.5, 3.89);
		
	}

}
