package sidharthsircorejava;

interface Greet{
	void getName(String name);
}
class Print{
	Print(String name){
		System.out.println("Welcome:"+name);
	}
}
public class Example6 {

	public static void main(String[] args) {
		Greet g= Print::new;
		g.getName("abc");
	
	}		
}