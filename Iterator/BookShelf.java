
import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
	
	private List<Book> books;
	
	public BookShelf() {
		books = new ArrayList<>();
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		books.add(book);
	}
	
	public int getLength() {
		return books.size();
	}
	
	@Override
	public MyIterator iterator() {
		return new BookShelfIterator(this);
	}
	
}
