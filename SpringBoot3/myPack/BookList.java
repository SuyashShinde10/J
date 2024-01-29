package myPack;

import java.util.Map;

public class BookList {
private Map <Integer ,String> bookMap;



public BookList() {
	super();
}

public Map<Integer, String> getBookMap() {
	return bookMap;
}

public void setBookMap(Map<Integer, String> bookMap) {
	this.bookMap = bookMap;
}

public BookList(Map<Integer, String> bookMap) {
	super();
	this.bookMap = bookMap;
}

@Override
public String toString() {
	return "BookList [bookMap=" + bookMap + "]";
}


}
