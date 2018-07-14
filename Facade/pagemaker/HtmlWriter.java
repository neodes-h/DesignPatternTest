package pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
	private Writer writer;
	protected HtmlWriter(Writer writer) {
		this.writer = writer;
	}
	
	protected void title(String title) throws IOException {
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>" + title + "</title>");
		writer.write("</head>");
		writer.write("<body>\n");
		writer.write("<h1>" + title + "</h1>");
	}
	
	protected void paragraph(String msg) throws IOException{
		writer.write("<p>" + msg + "</p>");
	}
	
	protected void link(String href, String caption) throws IOException{
		paragraph("<a href=\"" + href +"\">" + caption + "</a>");
	}
	
	protected void mailto(String mailaddr, String username) throws IOException{
		link("mailto:" + mailaddr, username);
	}
	
	protected void close() throws IOException{
		writer.write("</body>\n");
		writer.write("</html>\n");
		writer.close();
	}
	
}
