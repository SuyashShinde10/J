package Array.famt.ac.in;

import java.util.ArrayList;
import java.util.Collections;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Car> cr = new ArrayList<Car>();
		cr.add(new Car(1, "BMW", 200000000));
		cr.add(new Car(2, "MERCEDES", 250000000));
		cr.add(new Car(3, "TATA", 190000000));
		cr.add(new Car(4, "THAR", 180000000));
		cr.add(new Car(5, "ROLLSROYCE", 2000000000));
		cr.add(new Car(6, "SUPRA", 300000000));
		cr.add(new Car(7, "AUDI", 2000000));
		
		System.out.println("Cars before sorting:" +cr);
		Collections.sort(cr);
		System.out.println("Cars after sorting:" +cr);

	}

}
