
public class TicketMaker {
	private int ticket = 1000;
	private static TicketMaker ticketMaker = new TicketMaker();
	private TicketMaker() {}
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
	
	public static TicketMaker getInstance() {
		return ticketMaker;
	}
	
	
	
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			new Runnable() {
				public void run() {
					System.out.println(TicketMaker.getInstance().getNextTicketNumber());
				}
			}.run();
	}
}
