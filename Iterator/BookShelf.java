import java.util.ArrayList;

public class BookShelf implements Aggregate {
	private ArrayList books;
	
	public BookShelf(int initialize) {
		this.books = new ArrayList(initialize);
	}
	
	public Book getBookAt(int index) {
		return (Book)books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}
	
	public int getLength() {
		return books.size();
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
