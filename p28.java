package demo;

public class p28 {
	public static void main(String args[]) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=15;j++) {
				if(j<=4)
					System.out.print("*");
				else if(j<=5||j<=9)
					System.out.print("@");
				else if(j<=10||j<=15)
					System.out.print(j-9);
			}System.out.println();
		}
	}
}
