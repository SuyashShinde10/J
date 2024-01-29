package in.ac.famt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo1 {

	public static <Scanner> void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(55, "name55");
		hmap.put(52, "name52");
		hmap.put(45, "name45");
		hmap.put(32, "name32");
		hmap.put(88, "name88");
		hmap.put(28, "name28");
		hmap.put(82, "name82");
		hmap.put(81, "null");
		hmap.put(null, null);
		System.out.println("Hash Map is " + hmap);
		
		try {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter a key to search in the map -"); 
		}
		
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(82, "name82");
		tmap.put(25, "name25");
		tmap.put(67, "name67");
		tmap.put(32, "name32");
		tmap.put(80, "name80");
		tmap.put(1, null);
		System.out.println("Tree Map is " + tmap);
		
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(18, "name18");
		lmap.put(54, "name54");
		lmap.put(90, "name90");
		lmap.put(32, "name32");
		lmap.put(70, "name70");
		lmap.put(1, null);
		System.out.println("LinkedHash Map is " + lmap);
		
		
	}

}
