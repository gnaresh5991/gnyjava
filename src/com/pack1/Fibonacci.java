package com.pack1;

public class Fibonacci {
	 void fbnSeries()
	 {
		int n1=1,n2=2,n3,usr=10;
		System.out.print(n1+" "+n2);
		for(int i=2;i<usr;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
		n2=n3 ;
		n1=n2;
		}
	 }
	 public static void main(String[] args) {
		new Fibonacci().fbnSeries();
	}
}
