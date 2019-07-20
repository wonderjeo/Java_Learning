package hku.hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_demo {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Map<Integer, Integer> saftHM = Collections.synchronizedMap(hm);
		Hashtable ht = new Hashtable();
		ConcurrentHashMap chm = new ConcurrentHashMap();
		System.out.println("Hello");
	}
}
