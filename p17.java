package demo;

public class p17 {
public static void main(String args[]) {
	for(int i=1;i<=5;i++)
	{for(int j=1;j<=5;j++)
		if(j==2||j==1)
			System.out.print("#");
		else if(j<=5&&j>=3)
			System.out.print(i);
	System.out.println();
	}
}
}
