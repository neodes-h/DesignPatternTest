package factory;

import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {
	protected String title;
	protected String author;
	protected ArrayList<Item> content = new ArrayList<>();
	
	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void add(Item item) {
		this.content.add(item);
	}
	
	public void output() {
		try {
			String filename = title + ".html";
			Writer writer = new FileWriter(filename);
			writer.write(makeHTML());
			writer.close();
			System.out.println(filename + " finished");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public abstract String makeHTML();
}
