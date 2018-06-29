
public class BookShelfIterator implements Iterator {
	
	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if(this.index < this.bookShelf.getLength())
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		Book book = this.bookShelf.getBookAt(index);
		this.index ++;
		return book;
	}

}
