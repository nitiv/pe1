package com.stackroot.pe1;
import java.util.Scanner;
public class Prog2 {
	int a;
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		a=sc.nextInt();
		sc.close();
		if(a>20&& a<30)
		{
			if(a%2==0) 
			{
				System.out.println("jerry");
			}
			else
			{
				System.out.println("Tom");
			}
		}
		else
		{
			System.out.println("no is outside the range");
		}
		
	}
	public static void main(String args[]) {
		Prog2 p=new Prog2();
		p.cal();
	}
		
	
	
	
	
	
	
	
	
	

}
