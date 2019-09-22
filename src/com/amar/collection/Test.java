package com.amar.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		list.add("Rakesh");
		list.add("Amar");
		list.add("Amar");
		list.add("Asha");
		list.add("Bhushan");
		
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);	
//		}
		
		list.forEach(name -> System.out.println(name));
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Rakesh");
		map.put(2, "Amar");
		map.put(3, "AMar");
		map.put(2, "Asha");
		map.put(2, "Bhushan");
		
		map.forEach((k, v) -> System.out.println("Key " +k + ", " + "Value: " +v));
	}
}