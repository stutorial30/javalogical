package sidharthsircorejava;

public class CompanyMain {

	public static void main(String[] args) {
		Company man=new Management();
		man.DeptInfo(147);
		System.out.println(man.depttotalSal(25000, 147));
		Company it=new IT();
		it.DeptInfo(235);
		System.out.println(it.depttotalSal(400000, 235));
		
		//System.out.println(it.name);
		it.disp();
	}

}
