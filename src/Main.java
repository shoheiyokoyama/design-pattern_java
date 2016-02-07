
public class Main {

	public static void main(String[] args) {
		
		//IteratorPattern
//		testIteratorPattern();
		
		//AdapterPattern
		testAdapterPattern();
	}
	
	public static void testIteratorPattern() {
		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("Git Hub"));
		bookShelf.appendBook(new Book("Qiita"));
		bookShelf.appendBook(new Book("Java"));
		bookShelf.appendBook(new Book("Iterator pattern"));
		
		Iterator iterator = bookShelf.iterator();
		while(iterator.hasNext()) {
			Book book = (Book)iterator.next();
			System.out.println(book.getName());
		}
	}
	
	public static void testAdapterPattern() {
		Print print = new PrintBanner("Adapter Pattern");
		print.printWeak();
		print.printStrong();
		
		PrintForDelegation printForDelegation = new PrintBannerForDelegation("Adapter Pattern");
		printForDelegation.printWeak();
		printForDelegation.printStrong();
	}

}
