import java.util.Scanner;

public class Prog_003 
{
	public static void main(String[] args) 
	{
		int w,h;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter weight (pounds): ");
		w=in.nextInt();
		System.out.print("Enter height (in inches): ");
		h=in.nextInt();
		
		double BMI=(703*w)/(h*h);
		
		System.out.println("Body Mass Index (BMI) = : "+BMI);
	}

}
