package org.enumerator;

import java.util.*;

public class Enumerator {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40);
		Vector<Integer> vector = new Vector<>(list);
		
		Enumeration<Integer> elements = vector.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
	}

}
