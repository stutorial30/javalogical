package demo;

public class palinstr {
public static void main(String args[]) {
	String  s="riya";
	boolean flag=true;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(s.length()-1-i))
			continue;
		else
			flag=false;
		break;
	}if(flag)
		System.out.println("string is palindrome");
	else
		System.out.println("string not palindrome");
		
}}
