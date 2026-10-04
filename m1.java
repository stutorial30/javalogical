package demo;

public class m1 {
public static void main(String args[]) {
    int a[]= {6,5,3,8};
	int n=8;
  boolean b[]=new boolean[n];
	for(int i=0;i<a.length;i++) {
		b[a[i]-1]=true;}
		for(int j=0;j<b.length;j++) {
			if(!b[j])
				System.out.println((j+1)+"missing numbsrs");
		}}
	}

