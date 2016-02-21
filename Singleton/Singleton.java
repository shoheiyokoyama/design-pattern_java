
public class Singleton {
	
	private static Singleton singleton = new Singleton();
	public Singleton() {
		System.out.println("Cretae Instance");
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
