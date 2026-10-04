package demo;

public class sumoddarr {
public static void main(String args[]) {
	
	int a[]= {8,1,3,4,9,6,713};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0)
			sum+=a[i];
	}System.out.println(sum);
}
}
