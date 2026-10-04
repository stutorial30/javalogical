package demo;
import java.util.Arrays;
import java.util.*;
public class JavaPdfque {
	static int secondLargest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}
	static int[] merg(int[] a,int[] b) {
		int[] c=new int [a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		  for (int i = 0; i < b.length; i++) {
		        c[a.length + i] = b[i];
		    }
		    return c;
	}
	static void rotate(int[] ar) {
	    int last = ar[ar.length - 1];
	    for (int i = ar.length - 1; i > 0; i--) {
	        ar[i] = ar[i - 1];
	    }
	    ar[0] = last;
	}
	static String reverse(String str) {
	    String rev = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	        rev = rev + str.charAt(i);
	    }
	    return rev;
	}
	static boolean isAnagram(String s1, String s2) {
	    if (s1.length() != s2.length())
	        return false;
	    char[] a = s1.toLowerCase().toCharArray();
	    char[] b = s2.toLowerCase().toCharArray();
	    Arrays.sort(a);
	    Arrays.sort(b);
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] != b[i])
	            return false;
	    }
	    return true;
	}
	static char firstNonRepeating(String str) {
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        int count = 0;
	        for (int j = 0; j < str.length(); j++) {
	            if (ch == str.charAt(j)) {
	                count++;
	            }
	        }
	        if (count == 1) {
	            return ch;
	        }
	    }
	    return '_';}
	    public static void countCharacters(String str) {
	        int vowels = 0, consonants = 0, digits = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = Character.toLowerCase(str.charAt(i));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowels++;
	            } else if (Character.isLetter(ch)) {
	                consonants++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            }	        }
	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	        System.out.println("Digits: " + digits);
	    }
	    public static String removeDuplicates(String str) {
	        String result = "";
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (result.indexOf(ch) == -1) {
	                result += ch;
	            }	        }
	        return result;
	    }
	    public static String compressString(String str) {
	        String compressed = "";
	        int count = 1;
	        for (int i = 0; i < str.length(); i++) {
	            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
	                count++;
	                i++;
	            }
	            compressed += str.charAt(i);

	            if (count > 1) {
	                compressed += count;
	            }
	            count = 1;
	        }
	        return compressed;
	    }
	    public static int longestSubstring(String str) {
	        int maxLength = 0;
	        for (int i = 0; i < str.length(); i++) {
	            String temp = "";
	            for (int j = i; j < str.length(); j++) {
	                char ch = str.charAt(j);
	                if (temp.indexOf(ch) != -1) {
	                    break;
	                }
	                temp += ch;
	                maxLength = Math.max(maxLength, temp.length());
	            }        }
	        return maxLength;
	    }
	public static void main(String[] args) {
	    int[] arr = {10, 20, 5, 15, 30};
	    System.out.println("2nd largest num:"+secondLargest(arr));
	    
	    int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] result = merg(a, b);   
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        
        int[] ar = {1, 2, 3, 4, 5};
        rotate(ar);
        System.out.println(); 
        for (int x : ar)
            System.out.print(x + " ");

        String str = "sakshi";
        System.out.println(); 
        System.out.println(reverse(str));
        
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1, s2));
        
        String str1 = "aabbcde";
        System.out.println(firstNonRepeating(str1));
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str3 = sc.nextLine();
        countCharacters(str3);
        
        System.out.print("Enter a string: ");
        String str4 = sc.nextLine();
        System.out.println("After removing duplicates: " + removeDuplicates(str4));   
        
        System.out.print("Enter a string: ");
        String str5 = sc.nextLine();
        System.out.println("Length of longest substring: " + longestSubstring(str5));
        
        System.out.print("Enter a string: ");
        String str6 = sc.nextLine();
        System.out.println("Compressed String: " + compressString(str6));
 
        sc.close();
        }
}
