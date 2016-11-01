
public class GraphObserver {
	public void update(NumberGenerator generator) {
		System.out.println("GraphObserver:");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.println("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}
	}
}
