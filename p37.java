package demo;

public class p37 {
	public static void main(String args[]) {
		int []a= {34,6,7,89,34,56,14};
		for(int i=0;i<=a.length/2;i++) {
			int t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;}
			  for (int i = 0; i < a.length; i++) {
			        System.out.print(a[i] + " ");
			    }
}}
