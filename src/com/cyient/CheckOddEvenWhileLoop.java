package com.cyient;

public class CheckOddEvenWhileLoop {

	public static void main(String[] args) {
		int num=30;
		while(num>0)
		{
			if(num%2==0)
			{
				System.out.println("This is Even Number="+num);
			}
			else {
				System.out.println("This odd number="+num);
			}
		}
	}

}
