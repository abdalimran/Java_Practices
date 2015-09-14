package imran.java.prog_174;

public class BankAccount 
{
	private double amount=0;
	private double interestRate=0;
	private String name="";
	
	public BankAccount(double amount, double interestRate, String name)
	{
		this.amount=amount;
		this.interestRate=interestRate;
		this.name=name;
	}
	
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void setinterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}
	
	public double getinterestRate()
	{
		return interestRate;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public String getanme()
	{
		return name;
	}
	
	public void applyInterest()
	{
		amount+=(amount*(interestRate/100.0));
	}
}
