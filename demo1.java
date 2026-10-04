package demo;
import java.util.*;
public class demo1 {
public	void  arm()
	{ 
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number");
	int n=sc.nextInt();
		int r,sum=0;
		int temp=n;
		while(n!=0) {
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}if(sum==temp)
			System.out.println(temp+"is arm num");
		else 
			System.out.print(temp+"is not arm num");
		sc.close();
	}
public static void main(String args[]) {
	demo1 d=new demo1();
	d.arm();
}
}