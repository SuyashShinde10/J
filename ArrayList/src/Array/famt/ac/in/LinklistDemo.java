package Array.famt.ac.in;
import java.util.LinkedList;

public class LinklistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Book> ll = new LinkedList<Book>();
		Book b1 = new Book(1,"Let us C 1","ABC","XYZ",10);
		Book b2 = new Book(2,"Let us C 2","ERD","XYZ",60);
		Book b3 = new Book(3,"Let us C 3","LJY","XYZ",70);
		Book b4 = new Book(4,"Let us C 4","E","XYZ",100);
		 
		ll.add(b1);
		ll.add(b2);
		ll.add(b3);
		ll.add(b4);
		 
		for(Book b: ll){
			System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity+"");
		}
	}

}
