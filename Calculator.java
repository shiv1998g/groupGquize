package com.ps;

public class Calculator {
  
	  int a;
	  int b;
	 
	public static void main(String[] args) {
		int result=sum(10,20);
		if(result==30)
		  System.out.println(result);
	}
	
	
	public static int sum(int a,int b) {
		return a+b;
	}
}
