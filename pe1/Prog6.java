package com.stackroot.pe1;
import java.util.Scanner;
public class Prog6 {
public static void main(String args[]) {
	char c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter input value");
	c=sc.next().charAt(0);
	sc.close();
	if(c>='a'&&c<='z') {
		System.out.println("lowercase");
		
	}
	if(c>='A'&&c<='Z') {
		System.out.println("uppercase");
		
	}
	if(c>=0 && c<=9)
	{
		System.out.println("digit");
	}
	if((c>=32 && c<=47)|| (c>=58&& c<=64)||(c>=91&&c<=96)||(c>=123&&c<=126)) {
		System.out.println("Special char");
	}
				
	
	
}
}
