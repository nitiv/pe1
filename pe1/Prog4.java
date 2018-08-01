package com.stackroot.pe1;
import java.util.Scanner;
public class Prog4 {
	
	void eval()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();
		sc.close();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
		
		{
			System.out.print(i);
		}
			}
		
		}
	}
	public static void main(String args[]) {
		Prog4 p=new Prog4();
		p.eval();
		
	}

}
