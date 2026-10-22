package sidharthsircorejava;
import java.util.Comparator;
public class CartoonIdComparator implements Comparator<cartoons>{
	@Override
	public int compare(cartoons o1, cartoons o2) {
		return o1.getId().compareTo(o2.getId());
	}
}
