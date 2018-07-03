package listfactory;

import factory.Item;
import factory.Page;

public class ListPage extends Page {
	
	public ListPage(String title, String author) {
		super(title, author);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>\n<head>\n<title>" + this.title + "</title>\n</head>\n<body>\n");
		buffer.append("<h1>" + this.title + "</h1>\n");
		buffer.append("<ul>\n");
		for(Item item : this.content) {
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n");
		buffer.append("<hr><address>" + this.author + "</address>\n");
		buffer.append("</body>\n</html>\n");
		return buffer.toString();
	}

}
