package federico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exercise {
	/**
	 * 
	 * @param data
	 * @return
	 * 
	 *         {2, 3, 4, 5} -> {2, 4}
	 */
	public static ArrayList<Integer> evens(int[] data) {
		ArrayList<Integer> al = new ArrayList<>();
		if (data == null) {
			return al;
		}
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				al.add(data[i]);
			}
		}
		return al;
	}

	/**
	 * 
	 * @param data (ordered array)
	 * @return
	 * 
	 *         {1, 1, 2, 2, 5, 6, 6, 7} -> {5, 7}
	 */
	public static ArrayList<Integer> singles(int[] data) {
		ArrayList<Integer> al = new ArrayList<>();

		if (data == null) {
			return al;
		}

		if (data.length == 0) {
			return al;
		} else if (data.length == 1) {
			al.add(data[0]);
		} else {
			Arrays.sort(data);
			if (data[0] != data[1]) {
				al.add(data[0]);
			}
			for (int i = 1; i < data.length - 2; i++) {
				if ((data[i] != data[i - 1]) && (data[i] != data[i + 1])) {
					al.add(data[i]);
				}
			}
			if (data[data.length - 1] != data[data.length - 2]) {
				al.add(data[data.length - 1]);
			}
		}
		return al;
	}

	public static ArrayList<Integer> singlesMap(int[] data) {
		ArrayList<Integer> al = new ArrayList<>();
		HashMap<Integer, Boolean> map = aMap();

		if (data == null) {
			return al;
		}
		for (int i = 0; i < data.length; i++) {
			if (!map.containsKey(data[i])) {
				map.put(data[i], true);
			} else {
				map.put(data[i], false);
			}
		}
		Set<HashMap.Entry<Integer, Boolean>> items = map.entrySet();
		Iterator<HashMap.Entry<Integer, Boolean>> it = items.iterator();
		while (it.hasNext()) {
			HashMap.Entry<Integer, Boolean> item = it.next();
			if (item.getValue()) {
				al.add(item.getKey());
			}
		}
		return al;

	}
	
	
	private static HashMap<Integer, Boolean> aMap() {
		HashMap<Integer, Boolean> result = new HashMap<>();
		return result;
	}
}
