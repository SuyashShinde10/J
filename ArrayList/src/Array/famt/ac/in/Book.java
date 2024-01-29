package Array.famt.ac.in;

public class Book {
	int id;
	String name,author,publisher;
	int quantity;
	 
	
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name =name;
		this.author =author;
		this.publisher =publisher;
		this.quantity =quantity;
	}
		
		 public int CompareTo(Book o) {
			 if (quantity > o.quantity)
				 return 1;
			 else if (quantity > o.quantity)
				 return 0;
			 else  
				 return -1;
		 
		  
	}
}
