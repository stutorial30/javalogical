package demo;

public class p39 {
	public static void main(String args[]) {
		String s= "namaste";
		 char[] a = s.toCharArray();
		for(int i=0;i<=a.length/2;i++) {
			char t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;}
			  for (int i = 0; i < a.length; i++) {
			        System.out.print(a[i] + " ");
			    }
}
}