public class testIterator {

	public static void main(String[] args) {
		
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.appendBook(new Book("A"));
		bookShelf.appendBook(new Book("B"));
		bookShelf.appendBook(new Book("C"));
		bookShelf.appendBook(new Book("D"));
		
		MyIterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)(it.next());
			System.out.println(book.getName());
		}

	}

}
