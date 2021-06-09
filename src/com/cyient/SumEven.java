package com.cyient;

public class SumEven {

	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<=50; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				System.out.println("The sum of even number between 0 to 50="+sum);
			}
		}
		
		System.out.println("After adding the even and check it is odd or even number");
	
		if(sum%2==0)
		{
			System.out.println("This is even number="+sum);
		}
		else {
			System.out.println("This odd number="+sum);
		}
	}
	
}
