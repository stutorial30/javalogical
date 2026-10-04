package demo;

import java.util.Scanner;

public class JavaLogicalpdf {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.print("enter number:");
	int n=s.nextInt();
	  System.out.print("Enter x: ");
      int x = s.nextInt();
	int sum=0;
	int a = 0, b = 1;
	 long factorial = 1;
	 int power = 1;
		for(int i=0;i<=n;i++) {
		System.out.print("  "+i);
		System.out.println(" Square of  Numbers: "+(i*i));}
	System.out.println();
	for(int i=0;i<=n;i++) {
		if(i%2==0) { 
			System.out.print(" Even: "+i);
		}else {
			System.out.println(" Odd: "+i);
		}}
	for(int i=0;i<n;i++) {
		System.out.print(a + " ");
        int next = a + b;
        a = b;
        b = next;
	}System.out.println();
	System.out.print("Factorial Series:");
    for (int i = 1; i <= n; i++) {
        factorial *= i;
        System.out.print(factorial + " ");
    }System.out.println();
    System.out.print("Power Series:");
    for (int i = 1; i <= n; i++) {
        power *= x;
        System.out.print(power + " ");
    }System.out.println();
    System.out.print("Reverse Number Series:");
    for (int i = n; i >= 1; i--) {
        System.out.print(i + " ");
    }System.out.println();
    System.out.println("Sum of digits = " + sum);
		sum=n*(n+1)/2;
		System.out.println("Sum of Natural Numbers: "+sum);
     s.close();
}}
