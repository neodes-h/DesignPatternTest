
public class Player {
	private Strategy strategy;
	private String name;
	private int winCount = 0;
	private int loseCount = 0;
	private int gameCount = 0;
	public Player(String name, Strategy strategy) {
		this.strategy = strategy;
		this.name = name;
	}
	
	public Hand nextHand() {
		return strategy.nextHand();
	}
	
	public void win() {
		strategy.study(true);
		winCount ++;
		gameCount ++;
	}
	
	public void lose() {
		strategy.study(false);
		loseCount ++;
		gameCount ++;
	}
	
	public void even() {
		gameCount ++;
	}
	
	public String toString() {
		return "[" + this.name + "]----- total game:" + this.gameCount + ",win:"+ this.winCount + ",lose:" + this.loseCount;
	}
	
}
