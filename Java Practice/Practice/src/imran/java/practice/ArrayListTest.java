package imran.java.practice;

import java.util.ArrayList;

public class ArrayListTest 
{
	public static void main(String[] args) 
	{
		ArrayList<String> lists = new ArrayList<String>();
		ArrayList<Integer> listi = new ArrayList<Integer>();
		ArrayList<Double> listd = new ArrayList<Double>();
		
		lists.add("AAA");
		lists.add("BBB");
		
		listi.add(1);
		listi.add(2);
		
		listd.add(1.38746);
		listd.add(5.7635746);
		
		System.out.println(lists);
		System.out.println(listi);
		System.out.println(listd);
	}

}
