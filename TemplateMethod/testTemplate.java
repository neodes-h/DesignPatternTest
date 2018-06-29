
public class testTemplate {
	public static void main(String[] args) {
		AbstractDisplay ad1 = new CharDisplay('H');
		AbstractDisplay ad2 = new StringDisplay("Henry.");
		ad1.display();
		ad2.display();
	}
}
