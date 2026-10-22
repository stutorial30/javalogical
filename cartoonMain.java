package sidharthsircorejava;

import java.util.Scanner;
import java.util.TreeSet;
public class cartoonMain {
	static TreeSet<cartoons> c;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter yoour soting choice:");
		String userchoice=sc.next();
		if(userchoice.equalsIgnoreCase("id")) {
			c=new TreeSet<cartoons>(new CartoonIdComparator()); 
		}else if(userchoice.equalsIgnoreCase("name")) {
			c=new TreeSet<cartoons>(new CartoonIdComparator()); 
		}else {
			System.out.println("invalid choice");
			System.exit(1);
		}
		TreeSet<cartoons> c=new TreeSet<cartoons>(new CartoonIdComparator());
		c.add(new cartoons(2,"doreamon","hungama","shizuka"));
		c.add(new cartoons(5,"pokemon","hungama","pokemon"));
		c.add(new cartoons(3,"ninja hatori","nick","hatori"));
		c.add(new cartoons(7,"chota bhim","pogo","chutki"));
		c.add(new cartoons(9,"shinchan","hungama","himavari"));
		c.add(new cartoons(8,"tom and jerry","cn","jerry"));
		c.add(new cartoons(10,"motu patlu","nick","dr jhatka"));
		c.add(new cartoons(1,"roll no","cn","kanishk"));
		c.add(new cartoons(12,"ben 10","cn","ben"));
		c.add(new cartoons(11,"huddy mera buddy","cn","priti"));
        System.out.println(c);
        sc.close();
	}
}
