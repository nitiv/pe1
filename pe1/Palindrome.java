package com.stackroot.pe1;

public class Palindrome {
	int temp,r,s=0;
	void palin(int n)
	{
		temp=n;
    while(n>0) {
    	r=n%10;
    	s=s*10+r;
    	n=n/10;
    	
    }
    if(s==temp) {
    	int sum=0,x;
    	//System.out.println("no is palindrome");
    	while(s>0) {
    		x=s%10;
    		if(x%2==0) {
    			sum=sum+x;
    		}
    		s=s/10;
    		
    	}
    	if(sum>25)
    	{
    		System.out.println("No is palindrome and sum of even no is greater than 25");
    		
    	}	
    	else {
    		System.out.println("No is palindrome and sum of even no is not greater than 25");
    		
    	}
    	
    }
    else {
    	System.out.println("no is not palindrome");
    }
	}
public static void main(String args[])	{
	Palindrome p= new Palindrome();
	p.palin(2468642);
	p.palin(12345);
	//p.palin(12345654321);
	
	
}
}