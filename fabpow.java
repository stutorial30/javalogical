package demo;

import java.util.Arrays;
import java.util.Scanner;

public class fabpow {
	 static int fabb(int n) {
	        int f1 = 0, f2 = 1, f3 = 0;
	        for (int i = 1; i <= n; i++) {
	            System.out.println("Fibonacci series: " + f1);
	            f3 = f1 + f2;
	            f1 = f2;
	            f2 = f3;
	        }
	        return f1; 
	    }
	static int pow(int n) {
		return (int) Math.pow(n, n);
	}
	static int countDigits(int n) {
		Math.abs(n);
		  if (n == 0) {
		        return 1;
		    }
		  int count = 0;
		    while (n > 0) {
		        count++;
		        n /= 10;
		    }
		    return count;
	}
	static int arrlar() {
	    int a[] = {2, 4, 1, 6, 5};
	    int lar = a[0];
	    for(int i = 1; i < a.length; i++) {
	        if(a[i] > lar) {
	            lar = a[i];
	        }
	    }
	    return lar;
	}
	static int arrsm() {
		int a[] = {2, 4, 1, 6, 5};
	    int sm = a[0];
	    for(int i = 1; i < a.length; i++) {
	        if(a[i] < sm) {
	            sm = a[i];
	        }
	    }
	    return sm;
	}
	static int sortarr() {
	    int a[] = {2, 4, 1, 6, 5};
	    for (int i = 0; i < a.length - 1; i++) {
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[i] > a[j]) {
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }
	    for (int i = 0; i < a.length; i++) {
	        System.out.print(a[i]);
	    }
  return a[a.length - 1];
	}
	static int searchElement(int key) {
	    int a[] = {2, 4, 1, 6, 5};
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] == key) {
	            return i;
	        }
	    }
	    return -1; 
	}
	static String removeDuplicates() {
	    int a[] = {2, 4, 1, 2, 5, 4, 6};
	    int j,i;
	    String result="";
	    for ( i = 0; i < a.length; i++) {
	        for ( j = 0; j < i; j++) {
	            if (a[i] == a[j])
	                break;
	        }
	        if (i == j) {
	            result=result+a[i];
	        }
	    }return result;
	}
	static String revString() {
		String str="sakshi";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}return rev;
	}
	static int vowelStr(String str) {
		int cnt=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			  if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U') {
				  cnt++;
			  }
		}return cnt;
	}
	static boolean anagram(String s1,String s2) {
		char []a=s1.toLowerCase().toCharArray();
		char[] b = s2.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		return Arrays.equals(a,b);
	}
	static String removeSpaces(String str) {
	    return str.replace(" ", "");
	}
	static int countWords(String str) {
		String words[]=str.trim().split("\\s+");
		return words.length;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter num");
		int  n=s.nextInt();
		System.out.print("Enter element to search: ");
		int key = s.nextInt();
		System.out.println("Nth Fibonacci: "+fabb(n));
		System.out.println("n^n = "+pow(n));
		System.out.println("count digits are = "+countDigits(n));
		System.out.println("largest number in array ="+arrlar());
		System.out.println("smallest number in array ="+arrsm());
		System.out.println(" "+sortarr());
		
		int result = searchElement(key);

		if (result != -1) {
		    System.out.println("Element found at index: " + result);
		} else {
		    System.out.println("Element not found");
		}
		System.out.println("without duplicate:"+removeDuplicates());
		System.out.println("reverse string: "+revString());
		String str="sAkshi";
		System.out.println("count vowels of string: "+vowelStr(str));
		 
		String s1 = "listen";
		    String s2 = "silent";
		    System.out.println(anagram(s1, s2));
		    
		    String st = "sa k sh i";
		    System.out.println(removeSpaces(st));
		    
		    String str2 = "Java is easy to learn";
		    System.out.println("Word count: " + countWords(str2));
		s.close();
		}
}
