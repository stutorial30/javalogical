package demo;

public class p25 {
public static void main(String args[]) {
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=15;j++) {
			if(j<=5)
				System.out.print(j);
			else if(j<=6||j<=10)
				System.out.print("*");
			else
				System.out.print("@");
		}System.out.println();
	}
}
}
