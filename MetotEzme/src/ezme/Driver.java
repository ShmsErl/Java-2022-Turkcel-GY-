package ezme;

import java.util.Arrays;
import java.util.Comparator;

public class Driver {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Elma [] elmalar = {new Elma(10), new Elma(2), new Elma(13), new Elma(22)};
		//System.out.println(Arrays.toString(elmalar));
		
		Arrays.sort(elmalar, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Elma e1 = (Elma) o1;
				Elma e2 = (Elma) o2;
				return e1.getAgirlik() - e2.getAgirlik();
			}
		});
		System.out.println(Arrays.toString(elmalar));
						
		

	}

}
