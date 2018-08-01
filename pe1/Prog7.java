package com.stackroot.pe1;
import java.util.Scanner;
public class Prog7 {
	public static void main(String args[])
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no");
		int n=s.nextInt();
		s.close();
		int i=0,j,sum=0;
		int a[]=new int[50];
		do
		{
		int x=n%10;
		a[i]=x;
		n=n/10;	
		i++;
		}while(n>0);
for(j=0;j<i;j++) {
	for(int k=j;k<i;k++) {
		if(a[j]<a[k])
		{
			int temp=a[j];
			a[j]=a[k];
			a[k]=temp;
		}
	}
}
System.out.print("sorted array: ");
for(j=0;j<i;j++) {
System.out.print(a[j]);

if(a[j]%2==0) {
	sum=sum+a[j];
}
}
System.out.println("\n"+"Sum of even nos is "+sum);
if(sum>15) {
	System.out.println("True");
}
else {
	System.out.println("False");
}
		
	}

}
