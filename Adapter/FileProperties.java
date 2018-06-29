
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
	
	public FileProperties() {
	}

	@Override
	public void readFromFile(String filename) throws IOException {
		File file = new File(filename);
		load(new FileInputStream(filename));

	}

	@Override
	public void writeToFile(String filename) throws IOException {
		store(new FileOutputStream(filename), "Written by properties");
	}

	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return getProperty(key, "Key doesn't exist");
	}

}
