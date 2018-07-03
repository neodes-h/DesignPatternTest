package tablefactory;

import factory.Item;
import factory.Page;

public class TablePage extends Page {

	public TablePage(String title, String author) {
		super(title, author);
	}
	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>" + this.title + "</title></head>\n<body>\n");
		buffer.append("<h1>" + this.title + "</h1>");
		buffer.append("<table width='80%' border='3'>\n");
		for(Item item : this.content) {
			buffer.append(item.makeHTML());
		}
		
		buffer.append("</table>\n");
		buffer.append("</body>\n</html>\n");
		return buffer.toString();
	}

}
