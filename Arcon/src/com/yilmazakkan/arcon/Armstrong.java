package com.yilmazakkan.arcon;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int c=0,a,temp;  
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int deger =scan.nextInt();
	    int n=deger;			// 153, 370, 371, 407
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("-> "+ c + " = Armstrong Sayýdýr");   
	    else  
	        System.out.println("-> "+ c + " = Armstrong Sayý DEÐÝLDÝR !!!");   
	    
	   }  
}
