package com.cyient;

public class MaxAndMinElement {

	public static void main(String[] args) {
		float [] temp = {10.0f,11.3f, 4.5f,-2.0f,-3.3f,0.0f};
		float min=temp[0];
		float max=temp[0];
		for(int i=0; i<temp.length; i++)
		{
			if(temp[i]<min)
			{
				min = temp[i];
			}
			if(temp[i] > max)
			{
				max = temp [i];
			}
		}
		
		System.out.println("The minimum temp is="+max);
		System.out.println("The minimum temp is="+min);
		System.out.println("The Second array temp is");
			float temp1[]= {5.0f,11.0f,12.5f,-2.0f,3.6f,-4.3f,9.0f};
			float min1=temp1[0];
			float max1=temp1[0];
			for(int i=0; i<temp1.length; i++)
			{
				if(temp1[i]<min1)
				{
					min1 = temp1[i];
				}
				if(temp1[i] > max1)
				{
					max1 = temp1 [i];
				}
			}
			System.out.println("The minimum temp is="+max1);
			System.out.println("The minimum temp is="+min1);
		}
		
	}


