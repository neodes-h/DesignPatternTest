
import java.io.IOException;

public class testAdapter {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("year", "2018");
			f.setValue("month", "06");
			f.setValue("day", "29");
			f.writeToFile("output.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
