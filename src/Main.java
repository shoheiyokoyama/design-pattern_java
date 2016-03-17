import java.io.IOException;

import com.shohei_yokoyama.factory_framework.*;
import com.shohei_yokoyama.factory_framework.Product;
import com.shohei_yokoyama.factory_account.*;
import com.shohei_yokoyama.prototype_framework.*;

public class Main {

	public static void main(String[] args) {
		
		//Iterator-Pattern
//		testIteratorPattern();
		
		//Adapter-Pattern
//		testAdapterPattern();
		
		//TemplateMethod-Pattern
//		testTemplateMethodPattern();
		
		//FactoryMethod-Pattern
//		testFactoryMethodPattern();
		
		//Singleton-Pattern
//		testSingletonPattern();
		
		//Prototype-Pattern
		testPrototypePattern();
	}
	
	public static void testPrototypePattern() {
		
		Manager manager = new Manager();
		UnderLinepen upen = new UnderLinepen('~');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		
		manager.register("stong message", upen);
		manager.register("warning box", mbox);
		manager.register("slash box", sbox);
		
		PrototypeProduct p1 = manager.create("stong message");
		p1.use("Git Hub");
		PrototypeProduct p2 = manager.create("warning box");
		p2.use("Qiita");
		PrototypeProduct p3 = manager.create("slash box");
		p3.use("Java");
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
		Product account4 = factory.create("Erich Gamma");
		
		account1.use();
		account2.use();
		account3.use();
		account4.use();
	}
	
	public static void testSingletonPattern() {
//		System.out.println("Start");
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		if (instance1 == instance2) {
			System.out.println("instance1 and instance2 are same Instance");
		} else {
			System.out.println("instance1 and instance2 aren't same Instance");
		}
//		
//		System.out.println("End");
//		
//		System.out.println("Start");
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
//		}
//		System.out.println("End");
		
		System.out.println("Start");
		for (int i = 0; i < 9; i ++) {
			Triple triple = Triple.getInstance(i % 3);
			System.out.println(i + ":" + triple);
		}
		System.out.println("End");
	}
	
	
	
}
