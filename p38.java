package demo;

public class p38 {
	public static void main(String args[]) {
		String []a= {"hello","hi","olla","namaste","mushi"};
		for(int i=0;i<=a.length/2;i++) {
			String t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;}
			  for (int i = 0; i < a.length; i++) {
			        System.out.print(a[i] + " ");
			    }
}}
