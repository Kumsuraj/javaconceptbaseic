package com.cyient;

public class Area {
	public double AreaOfCricle(double r)
	{
		double area=3.14*r*r;
		return area;
		
	}
	
	public double AreaOfTrangle(double b, double h)
	{
		double area=(b*h)/2.0;
		return area;
		
	}

	public static void main(String[] args) {
		Area obj=new Area();
		double result=	obj.AreaOfCricle(10);
	System.out.println("The area of cricle="+result);
	double result1=obj.AreaOfTrangle(10, 20);
	System.out.println("The area of Trangle="+result1);
		
	}

}
