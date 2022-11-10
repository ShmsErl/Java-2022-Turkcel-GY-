package ezme;

import java.util.Comparator;

public class ElmaKarsilasitirici implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Elma e1 = (Elma) o1;
		Elma e2 = (Elma) o2;
		return e2.getAgirlik() - e1.getAgirlik();
	}

}
