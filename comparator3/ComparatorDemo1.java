package famt.ac.in;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo1 {

	public  static void main (String [] args) { 
		// TODO Auto-generated constructor stub
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student ("name5",30,46,50));
		ar.add(new Student ("name4",30,78,50));
		ar.add(new Student ("name3",30,80,56));
		ar.add(new Student ("name2",85,30,50));
		ar.add(new Student ("name1",60,46,50));
		
		System.out.println("List is -" + ar);
		Collections.sort(ar,new  M2Sort());
		System.out.println("List is - "+ ar);
	}
	
}
