package listfactory;

import factory.Item;
import factory.Tray;

public class ListTray extends Tray {
	
	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<li>\n");
		buffer.append(this.caption + "\n");
		buffer.append("<ul>\n");
		for(Item item : this.tray) {
			buffer.append(item.makeHTML());
		}
		buffer.append("</ul>\n</li>\n");
		return buffer.toString();
		
	}

}
