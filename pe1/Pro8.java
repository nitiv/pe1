package com.stackroot.pe1;
import java.util.Scanner;
public class Pro8 {
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess a no in the range 1-50");
		int a=sc.nextInt();
		sc.close();
		double n=Math.random();
		System.out.println(n);
		if(a>=1 && a<=50) 
		{
			
			if(a<n) {
				System.out.println("number guessed is less than original number");
			}
			if(a>n) {
				System.out.println("number guessed is more than original number");
			}
			if(a==n) {
				System.out.println("you guessed correct!!");
			}
			
		}
		else 
		{
			System.out.println("out of range!!");
		}
			

}
	}
