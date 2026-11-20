package sidharthsircorejava;
interface Input{

	Operations2 getInput(int i);

}
class Operations2{
	private Integer num;
	Operations2(Integer num){
		
	}
	public Integer square() {
		return num*num;
	}
	public Integer cube() {
		return num*num*num;
	}
	public Integer sqrt(){
		return(int) Math.sqrt(num);
	}
}
public class Eample7 {

	public static void main(String[] args) {
		Input i=Operations2::new;
		Operations2 op=i.getInput(10);
		System.out.println(op.square());

	}

}
