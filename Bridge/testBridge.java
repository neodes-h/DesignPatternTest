import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class testBridge {

	public static void main(String[] args) throws IOException {
		Display d1 = new Display(new StringDisplayImpl("Hello China"));
		Display d2 = new CountDisplay(new StringDisplayImpl("Hello World"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello Canada"));
		RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Henry"));
		RandomDisplay d5 = new RandomDisplay(new TextDisplayImpl("output.txt"));
		newDisplay d6 = new newDisplay(new newDisplayImpl('<', '*', '>'), 4);
		newDisplay d7 = new newDisplay(new newDisplayImpl2('|', '#', '-'), 6);
		
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
		d4.randomDisplay(5);
		d5.randomDisplay(5);
		d6.decorateDisplay();
		d7.decorateDisplay();
		
		
	}

}
