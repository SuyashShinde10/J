package famt.ac.in;

import java.util.Comparator;

public class M2Sort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if (o1.m2<o2.m2)
			return 1;
		else if (o1.m2>o2.m2)
			return -1;
		else
		return 0;
	}
	
}
