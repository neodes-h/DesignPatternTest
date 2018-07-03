package tablefactory;

import factory.Item;
import factory.Tray;

public class TableTray extends Tray {
	
	public TableTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<td>\n");
		buffer.append("<table width='100%' border='1'><tr>");
		buffer.append("<td bgcolor='#cccccc' align='center' colspan=" + this.tray.size() + "><b>" + this.caption + "</b></td>\n</tr>");
		buffer.append("<tr>\n");
		for(Item item : this.tray) {
			buffer.append(item.makeHTML());
		}
		buffer.append("</tr>\n</table>\n");
		buffer.append("</td>\n");
		return buffer.toString();
	}

}
