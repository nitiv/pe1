package com.stackroot.pe1;
import java.util.Scanner;
public class Prog10 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String st=s.next();
		System.out.println("enter a no");
		int n=s.nextInt();
		s.close();
		System.out.print(st);
		char c[]=st.toCharArray();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j<c.length;j++)
			{
				System.out.print(c[j]);
			}
		}
		
		
				
		
	}
	
	
	

}
