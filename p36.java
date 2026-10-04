package demo;

public class p36 {
	public static void main(String args[]) {
		for(int i=5;i>=1;i--) {
			for(int j=0;j<=5;j++) {
				if(j<=5-i)
					System.out.print(" ");
				else
				System.out.print("*");
			}System.out.println();
		}
	}
}
