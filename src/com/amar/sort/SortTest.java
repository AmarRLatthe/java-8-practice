package com.amar.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {

	List<Integer> l = null;
	
	public static void main(String[] args) {
		
		new SortTest().test();
		
	}
	
	public void test() {
		l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(20);
		l.add(6);
		System.out.println("Before sort : " +l);
		
		Collections.sort(l, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		System.out.println("After sort : " +l);
	}
}
