
public class DegitObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.println("DegitObserver:" + generator.getNumber());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
		}
	}
}
