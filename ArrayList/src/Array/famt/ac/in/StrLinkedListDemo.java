package Array.famt.ac.in;

import java.nio.file.spi.FileSystemProvider;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class StrLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		
		System.out.println("LL contains" +ll);
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.addAll(ll);
		System.out.println("LL1 contains" +ll1);
		
		System.out.println(ll);
//		System.out.println(ll.get(1));
//		System.out.println(ll.contains("three")?"Contains three":"does not contains");
//		
//		LinkedList<String> ll2 = new LinkedList<String>();
//		ll2.addAll(ll1);
//		System.out.println("List 2 contains:" +ll2);
//		System.out.println("2nd element in ll2 is:" +ll2.get(2));
//		ll2.set(3, "five");
//		System.out.println("\n modified list 2 is:" +ll2);
//		Collections.reverse(ll2);
//		System.out.println("After reversation:" +ll2);
//		ll2.remove(3);
//		System.out.println("After After invoking remove() method:" +ll2);
//		ll2.add(null);
//		System.out.println("List 2 contains:" +ll2);
//		ll2.set(3, "six");
//		ll2.add("four");
//		System.out.println("List 2 after adding values:" +ll2);
		
		ll1.remove();
		ll1.addFirst("five");
		System.out.println("Add first" +ll1);
		
		ll1.addLast("six");
		System.out.println("Add last" +ll1);
		
		ll1.removeLast();
		System.out.println("After invoking remove last() method:" +ll1);
		
		ll1.peekFirst();
		System.out.println("After invoking peek first() method:" +ll1);
		
		Collections.sort(ll1);
		System.out.println("After sort:" +ll1);
		
		Collections.reverse(ll1);
		System.out.println("after reverse:" +ll1);
		
	}

}
