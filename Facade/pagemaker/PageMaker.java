package pagemaker;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;import java.util.Set;

public class PageMaker {
	private PageMaker() {
		
	}
	
	public static void makeWelcomePage(String mailaddr, String filename) throws FileNotFoundException, IOException {
		Properties prop = Database.getProperties("maildata");
		String username = prop.getProperty(mailaddr);
		HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
		writer.title("welcome to " + username + "'s page");
		writer.paragraph(username + " 欢迎来到" + username + "的主页");
		writer.paragraph("waiting for your email");
		writer.mailto(mailaddr, username);
		writer.close();
		System.out.println(filename + "is created for " + mailaddr + "(" + username + ")");
	}
	
	
	public static void makeLinkPage(String filename) throws FileNotFoundException, IOException {
		Properties prop = Database.getProperties("maildata");
		HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
		
		writer.title("Link Page");
		
		for(Entry<Object, Object> item : prop.entrySet()) {
			writer.mailto((String)(item.getKey()), (String)(item.getValue()));
		}
		writer.close();
	}
}
