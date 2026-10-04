package demo;

import java.util.Scanner;

public class pelindrom {
	public void pel()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter number");
		int n=s.nextInt();
		int sum=0,r;
		int temp=n;
		while(n!=0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}if(sum==temp) {
			System.out.print(temp+"is pelindrom num");
		}else {
			System.out.print(temp+"is not pelindrom num");
		}
		s.close();
	}
	public static void main(String args[]) {
		pelindrom p=new pelindrom();
		p.pel();
	}
}
