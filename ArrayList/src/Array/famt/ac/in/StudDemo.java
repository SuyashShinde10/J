package Array.famt.ac.in;

import java.util.ArrayList;
import java.util.Collections;

public class StudDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stud> ar = new ArrayList<Stud>();
		
		ar.add(new Stud(1, "Abdullah", 90, 90, 80));
		ar.add(new Stud(2, "Uzaif", 90, 90, 70));
		ar.add(new Stud(3, "Rupali", 60, 90, 80));
		ar.add(new Stud(4, "Mahek", 60, 70, 80));
		ar.add(new Stud(5, "Riza", 50, 60, 70));
		
		System.out.println("Student List:" +ar);
		Collections.sort(ar);
		System.out.println("After sort:" +ar);

	}

}
