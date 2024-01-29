package in.ac.famt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(20);		
		arr.add(10);		
		arr.add(30);
		arr.add(50);
		arr.add(40);
		arr.add(70);
		arr.add(80);
		arr.add(60);
		
		HashSet<Integer> hSet = new HashSet<Integer>();
		hSet.addAll(arr);
		hSet.add(null);
		System.out.println("Hash Set is " + hSet);
		
		LinkedHashSet<Integer> lSet = new LinkedHashSet<Integer>();
		lSet.addAll(arr);
		lSet.add(null);
		System.out.println(" Linked Set is " + lSet);
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.addAll(arr);
//		tSet.add(null);
		System.out.println(" Tree Set is " + tSet);
		}

}
