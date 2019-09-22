package com.amar.sort;

import java.util.TreeMap;

public class MapSort {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		
		map.put(10, "Amar");
		map.put(06, "Asha");
		map.put(01, "Bhushan");
		map.put(20, "Ashwini");
		map.put(02, "Prakash");
		System.out.println(map);
	}
}
