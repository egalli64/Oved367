package francesco;

import java.time.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Sandbox {


	public static int digitSum(int value) throws ExcerciseException, Exception2 {
		if (value < 0) {
			throw new ExcerciseException("Value is negative!");
		}
		if (value == 0)
			throw new Exception2("Value equals zero");
		int temp = 0;
		for (;;) {
			temp += value % 10;
			value /= 10;
			if (value == 0) {
				break;
			}
		}
		return temp;
	}

	public static ArrayList<Integer> singles(int[] data) throws Exception {
		if (data == null) {
			throw new Exception("Null array in input!!");
		}
		var result = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < data.length; i++) {
			if (!map.containsKey(data[i])) {
				map.put(data[i], 1);
			} else {
				map.put(data[i], map.get(data[i]) + 1);
			}
		}
		Set<Map.Entry<Integer, Integer>> couples = map.entrySet();
		for (var element : couples) {
			if (element.getValue() == 1) {
				result.add(element.getKey());
			}
		}
		return result;
	}
}
