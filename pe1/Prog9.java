package com.stackroot.pe1;
import java.util.Scanner;
public class Prog9 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String st=s.next();
		s.close();
		char c[]=st.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
