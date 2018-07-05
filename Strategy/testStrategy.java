
public class testStrategy {

	public static void main(String[] args) {
		int seed1 = 314;
		int seed2 = 15;
		Player player1 = new Player("A", new WinningStrategy(seed1));
		Player player2 = new Player("B", new ProbStrategy(seed2));
		
		for(int i = 0; i < 10000; i ++) {
			Hand hand1 = player1.nextHand();
			Hand hand2 = player2.nextHand();
			if(hand1.isStronger(hand2)) {
				player1.win();
				player2.lose();
				System.out.println("Winner:" + player1);
			} else if(hand1.isWeaker(hand2)) {
				player1.lose();
				player2.win();
				System.out.println("Winner:" + player2);
			} else {
				player1.even();
				player2.even();
				System.out.println("Even");
			}
			
		}
		System.out.println("Final result");
		System.out.println(player1);
		System.out.println(player2);

	}

}
