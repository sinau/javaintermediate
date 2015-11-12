package javaintermediate.session1;

import java.util.HashMap;
import java.util.Map;

public class CobaMap {
	public static void main(String[] args) {
		Map<Integer, String> handphoneMap = new HashMap<Integer, String>();
		handphoneMap.put(1, "samsung");
		handphoneMap.put(2, "lenovo");
		handphoneMap.put(3, "iphone");
		
		for(Integer key : handphoneMap.keySet()) {
			System.out.println("Key: " + key);
			System.out.println("handphone: " + handphoneMap.get(key));
		}
	}
}
