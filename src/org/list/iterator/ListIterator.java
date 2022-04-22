package org.list.iterator;

import java.util.*;

public class ListIterator {

	private void listIterator() {

		List<String> names = new LinkedList<>();
		names.add("Welcome");
		names.add("To");
		names.add("Gfg");

		// Getting ListIterator
		java.util.ListIterator<String> namesIterator = names.listIterator();

		// Traversing elements
		while (namesIterator.hasNext()) {
			System.out.println(namesIterator.next());
		}

		// for-each loop creates Internal Iterator here.
		for (String s : names) {
			System.out.println(s);
			System.out.println("p");
			System.out.println(s);
			System.out.println("p");
		}

	}

	private void listIteratorForBack() {
		 
		// java program to traverse the list both in forward and
		// backward direction using listIterator
	
		List<String> list = Arrays.asList("learn", "from", "Gopi");		
		List<String> names = new LinkedList<>(list);

		java.util.ListIterator<String> listIterator = names.listIterator();

		// Traversing elements
		System.out.println("Forward Direction Iteration:");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("-------------------------------");
		
		// Traversing elements, the iterator is at the end
		// at this point
		System.out.println("Backward Direction Iteration:");
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
	}

	public static void main(String[] args) {
		
		ListIterator l = new ListIterator();
		l.listIterator();
		l.listIteratorForBack();
		
	}
}
