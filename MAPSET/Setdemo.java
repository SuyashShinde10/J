package famt.ac.in;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  ar = new ArrayList<Integer>();
		ar.add(20);  ar.add(60);
		ar.add(40);  ar.add(99);
		ar.add(20);  ar.add(55);
		
		Set<Integer> hSet = new HashSet<Integer>();
		hSet.addAll(ar);
		hSet.add(null);
		System.out.println("Hash Set is " + hSet);
		
		LinkedHashSet<Integer> lSet = new LinkedHashSet<Integer>();
		lSet.addAll(ar);
		lSet.add(null);
		System.out.println("Linked Set is " + lSet);
		
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.addAll(ar);
		//tSet.add(null);
		System.out.println("Tree Set is " + tSet);
		

	}

}
