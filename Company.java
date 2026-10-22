package sidharthsircorejava;

public abstract class Company {
	public Company() {
		System.out.println("I am Constructor of Company");
	}
     String name="WIPRO";
     String address="Pune";
     abstract void DeptInfo(int empsize) ;
     abstract double depttotalSal(int sal,int empsize);
     public void disp() {
    	 System.out.println(name+" - "+address);
     }
}
