package demo;

public class stud {
int id;
String name;
int marks;
public static int MAX_MARKS=100;
public stud() {
	
}
public stud(int id,String name,int MAX_MARKS) {
	this.id=id;
	this.name=name;
	stud.MAX_MARKS=MAX_MARKS;
}
public @interface override{}
public String toString(){
	return "id "+ id+"name "+name+" mark"+MAX_MARKS;
}
}
