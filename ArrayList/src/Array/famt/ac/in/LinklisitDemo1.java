package Array.famt.ac.in;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinklisitDemo1 {
	public static void main (String args[]) {
		
		LinkedList<Student> std = new LinkedList<Student>();
		Student s1 = new Student(1,"ABC","Ratnagiri",1,50,60,70, 0);
		Student s2 = new Student(2,"YTR","Ratnagiri",2,70,80,37, 0);
		Student s3 = new Student(3,"SIU","Ratnagiri",3,80,79,80, 0);
		 
		std.add(s1);
		std.add(s2);
		std.add(s3);
		 
		 
		for(Student s: std){
			System.out.println(s.id+""+s.name+""+s.address+""+s.rollno+""+s.m1+""+s.m2+""+s.m3+"");
		}
		Collections.sort(std);
		System.out.println(std);
	}

}
