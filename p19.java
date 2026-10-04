package demo;

public class p19 {
public static void main(String args[]) {
	for(int i=1;i<=6;i++) {
		for(int j=1;j<=5;j++) {
			if(j==1||i==1||j==5)
				System.out.print(1);
			else
				System.out.print(j);
		}System.out.println();
	}
}
}
