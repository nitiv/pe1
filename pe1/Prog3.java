package com.stackroot.pe1;

import java.util.Scanner;

public class Prog3 {
	
	void check()
	{
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener a string");
		st=sc.next();
		sc.close();
		
		for(int i=0;i<st.length();i++)
		{
		 char s=st.charAt(i);
		
		if(s>='a' || s<='z'||s>='A' || s<='Z')
		{
			if(s=='a'||s=='i'||s=='e'||s=='o'||s=='u'||s=='A'||s=='E'||s=='O'||s=='I'||s=='U')
			{
				System.out.println("vowel");
			}
			else {
				
			
				System.out.println("consonent");
			}
		}
		
		
		
		else {
			System.out.println("not a valid alphabet!!");
		}
		}
	
	}
	public static void main(String args[]) {
		Prog3 p=new Prog3();
		p.check();
	}
	

}
