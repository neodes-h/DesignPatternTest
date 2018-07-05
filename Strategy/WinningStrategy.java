import java.util.Random;

public class WinningStrategy implements Strategy {

	private boolean won = false;
	private int prevHand_value;
	Random random;
	public WinningStrategy(int seed) {
		random = new Random(seed);
	}
	
	@Override
	public Hand nextHand() {
		if(!won ) {
			return Hand.getHand(random.nextInt(3));
		} else
			return Hand.getHand(prevHand_value);
	}

	@Override
	public void study(boolean win) {
		this.won = win;
	}

}
