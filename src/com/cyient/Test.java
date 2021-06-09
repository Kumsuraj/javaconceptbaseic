package com.cyient;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("please enter the vaild number");
	     Scanner sc=new Scanner(System.in);
	     int num=sc.nextInt();
	     if(num>90)
	     {
	    	 System.out.println("A grade");
	     }
	     else if(num>80 || num>89)
	    		  {
	    	 System.out.println("B grade");
	     }
	     else if(num>60 || num>79)
	     {
	    	 System.out.println("C Grade");
	     }
	     else if(num>33 || num>59)
	     {
	    	 System.out.println("D Grade");
	     }
	     else if(num<33)
	     {
	    	 System.out.println("F Grade");
	     }
	     else {
	    	 System.out.println("Sorry invilid number");
	     }

	}

}
