package demo;
import java.util.*;
public class Sum {
public  static int sum(int a,int b) {
	return (a+b);
}
static int max(int a,int b) {
	if (a>b)
	return a;
	else
		return b;
}
static int eo(int a) {
	if (a%2==0)
	return a;
	else
		return 0;
}
static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}
public static int reverseNumber(int num) {
    int reverse = 0;
    while (num > 0) {
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        num = num / 10;
    }
    return reverse;
}
public static int isPrime(int n) {
    if (n <= 1)
        return 0;
    for (int i = 2; i < n; i++) {
        if (n % i == 0)
            return 0;
    }

    return 1;
}
public static void main(String args[]) {
 System.out.print("enter a and b");
 Scanner s=new Scanner(System.in);
int  a=s.nextInt();
int  b=s.nextInt();
int  n=s.nextInt();
System.out.println("Addition of 2 numbers="+sum(a,b));
System.out.println(max(a,b)+"is greater");
System.out.println(eo(a)+"is even");
System.out.println("factorial of n ="+factorial(n));
System.out.println("reverse of n ="+reverseNumber(n));

int result = isPrime(n);  
if (result == 1)
    System.out.println(n + " is prime");
else
    System.out.println(n + " is not prime");
s.close();
}
}
