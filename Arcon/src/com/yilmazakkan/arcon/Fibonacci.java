package com.yilmazakkan.arcon;

public class Fibonacci {

	public static void main(String[] args) {
		
		long a=1;
		long b=1;
		long c = 0;
		for(int i = 0; i<600; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println("fibonacci 600 =" +c);
		}
		
	}

}
