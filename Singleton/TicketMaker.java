
public class TicketMaker {

	private int ticket = 1000;
	private static TicketMaker singleton = new TicketMaker();
	
	public TicketMaker() {
		
	}
	
	public static TicketMaker getInstance() {
		return singleton;
	}
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
