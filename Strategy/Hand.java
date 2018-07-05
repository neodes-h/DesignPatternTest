
public class Hand {
	
	public static final int HAND_VALUE_STONE = 0;
	public static final int HAND_VALUE_SCISSOR = 1;
	public static final int HAND_VALUE_CLOTH = 2;
	public static final Hand[] hands = {
			new Hand(HAND_VALUE_STONE),
			new Hand(HAND_VALUE_SCISSOR),
			new Hand(HAND_VALUE_CLOTH)
	};
	
	private static final String[] names = {
			"Stone","Scissor","Cloth"
	};
	
	private int handvalue;
	private Hand(int handvalue) {
		this.handvalue = handvalue;
	}
	
	public static Hand getHand(int index) {
		return hands[index];
	}
	
	public boolean isStronger(Hand h) {
		return fight(h) == 1;
	}
	
	public boolean isWeaker(Hand h) {
		return fight(h) == -1;
	}
	
	private int fight(Hand h) {
		if(h.handvalue == this.handvalue)
			return 0;
		else if((this.handvalue + 1) % 3 == h.handvalue)
			return 1;
		else 
			return -1;
	}
	
	public String toString() {
		return names[handvalue];
	}
	
}
