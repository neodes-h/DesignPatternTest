import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextDisplayImpl extends DisplayImpl {
	
	private String filename;
	private BufferedReader reader;
	public TextDisplayImpl(String filename) throws IOException {
		this.filename = filename;
		File file = new File(filename);
		reader = new BufferedReader(new FileReader(file));
		reader.mark(4096);
	}

	@Override
	public void open() {
		System.out.println("=========" + this.filename + "=========");

	}

	@Override
	public void print() {
		String line;
		
		try {
			reader.reset();
			while((line = reader.readLine()) != null) {
				System.out.println(">" + line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void close() {
		System.out.println("=========close=========");

	}

}
