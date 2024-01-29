package famt.ac.in;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer , String> hmap = new HashMap<Integer , String>();
		hmap.put(55,"name10");
		hmap.put(36,"name18");
		hmap.put(45,"name80");
		hmap.put(89,"name60");
		hmap.put(34,"name100");
		hmap.put(1,null);
		hmap.put(null,null);
		hmap.replace(55, "name84");
		System.out.println("Hmap is " + hmap);
		
		
		
		
		LinkedHashMap<Integer , String> lmap = new LinkedHashMap<Integer , String>();
		lmap.put(45,"name17");
		lmap.put(34,"name14");
		lmap.put(89,"name84");
		lmap.put(23,"name85");
		lmap.put(29,"name90");
		lmap.put(1,null);
		lmap.put(null,null);
		
		System.out.println("LinkedHashMap is " + lmap);
		
		
	}

}
