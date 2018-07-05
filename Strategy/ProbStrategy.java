import java.util.Random;

public class ProbStrategy implements Strategy {

	
	private int[][] history = {
		{ 1 , 1 , 1},
		{ 1 , 1 , 1},
		{ 1 , 1 , 1}
	};
	private int prevHand_value = 0;
	private int currHand_value = 0;
	private Random random;
	public ProbStrategy(int seed) {
		random = new Random(seed);
	}
	@Override
	public Hand nextHand() {
		int sum = history[prevHand_value][0] + history[prevHand_value][1] + history[prevHand_value][2];
		int rand = random.nextInt(sum);
		int handvalue;
		if(rand < history[prevHand_value][0])
			handvalue = 0;
		else if(rand < history[prevHand_value][1] + history[prevHand_value][0])
			handvalue = 1;
		else
			handvalue = 2;
		
		prevHand_value = currHand_value;
		currHand_value = handvalue;
		return Hand.getHand(currHand_value);
	}

	@Override
	public void study(boolean win) {
		if(win) {
			history[prevHand_value][currHand_value] ++;
		} else {
			history[prevHand_value][(currHand_value + 1) % 3] ++;
			history[prevHand_value][(currHand_value + 26) % 3] ++;
		}

	}

}
