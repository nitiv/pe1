package com.stackroot.pe1;
import java.util.Scanner;
public class Prog5 {



    public static void main(String[] args) {
    	int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no of input");
       int n=sc.nextInt();
       sc.close();
       int a[]=new int[n];
       System.out.println("Enter nos");
       for(int i=0;i<n;i++)
       {
    	    a[i]= sc.nextInt();
       }
       
       for(int i=0;i<n;i++)
       {
    	   sum=sum+a[i];
       }
       System.out.println("Sum is"+sum);
}    
}