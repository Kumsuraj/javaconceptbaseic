package com.cyient;



public class GradeSwitch {

	public static void main(String[] args) {
		int number[]= {10, 20,30,40,50,60,80,55,42,8,64,25,35};
		for(int i=0; i<number.length; i++)
		{
			if(number[i]<50)
			{
				System.out.println(number[i]);
			}
		}
		String colour[]= {"red", "yellow","pink","green"};
		
		for( String colour1 : colour)
		{
			System.out.println(colour1);
		}
	}

}
