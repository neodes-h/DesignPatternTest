import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class testFactory {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("A");
		Product card2 = factory.create("B");
		Product card3 = factory.create("C");
		
		card1.use();
		card2.use();
		card3.use();
	}
}
