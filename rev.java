package demo;

public class rev {
public static void main(String args[]) {
	String s="Hello";
	char [] c=s.toCharArray();
	for(int i=0;i<c.length/2;i++) {
		char temp=c[c.length-1-i];
		c[c.length-1-i]=c[i];
		c[i]=temp;
	}for(int j=0;j<c.length;j++) {
		System.out.print(c[j]+" ");
	}}
}
