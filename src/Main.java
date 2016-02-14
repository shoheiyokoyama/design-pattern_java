import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		//Iterator-Pattern
//		testIteratorPattern();
		
		//Adapter-Pattern
//		testAdapterPattern();
		
		//TemplateMethod-Pattern
		testTemplateMethodPattern();
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
		
		FileIo fileIo = new FileProperties();
		try {
			fileIo.readFromFile("file.txt");
			fileIo.setValue("Apple", "iPhone");
			fileIo.setValue("Google", "Android");
			fileIo.setValue("Git", "Hub");
			fileIo.setValue("DesignPattern", "Adapter");
			fileIo.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void testTemplateMethodPattern() {
		
		AbstractDisplay cd = new CharDisplay('T');
		
		AbstractDisplay sd = new StringDisplay("Hello World");
		
		AbstractDisplay sd2 = new StringDisplay("KONNITIWA SEKAI");
		
		cd.display();
		sd.display();
		sd2.display();
		
	}
}
