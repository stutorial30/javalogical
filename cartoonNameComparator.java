package sidharthsircorejava;
import java.util.Comparator;
public class cartoonNameComparator implements Comparator<cartoons>{
	@Override
	public int compare(cartoons o1, cartoons o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
