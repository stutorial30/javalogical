package demo;

public class sumevearr {
public static void main(String args[]) {
	int []arr= {2,1,3,4,5,6};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0)
		sum+=arr[i];}
	System.out.println(sum);
}
}
