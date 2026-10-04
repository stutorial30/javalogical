package demo;

public class p7 {
public static void main(String args[]) {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=11;j++)
		{
			if(j<=5)
				System.out.print(j);
			else if(j==6)
				System.out.print("Hello");
			else if(j<=10)
				System.out.print("*");
			else
				System.out.print("Hi");
		}System.out.println();
	}
}
}
