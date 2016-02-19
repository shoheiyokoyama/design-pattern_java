import java.io.IOException;

import com.shohei_yokoyama.factory_framework.*;
import com.shohei_yokoyama.factory_account.*;

public class Main {

	public static void main(String[] args) {
		
		//Iterator-Pattern
//		testIteratorPattern();
		
		//Adapter-Pattern
//		testAdapterPattern();
		
		//TemplateMethod-Pattern
//		testTemplateMethodPattern();
		
		//FactoryMethod-Pattern
		testFactoryMethodPattern();
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
		
		AbstractDisplay sd = new StringDisplay("Design Pattern");
		
		AbstractDisplay sd2 = new StringDisplay("Template Method");
		
		cd.display();
		sd.display();
		sd2.display();
		
	}
	
	public static void testFactoryMethodPattern() {
		
		Factory factory = new AccountFactory();
		Product account1 = factory.create("Ralph Johnson");
		Product account2 = factory.create("Richard Helm");
		Product account3 = factory.create("John Vlissides");
		
		account1.use();
		account2.use();
		account3.use();
	}
}
