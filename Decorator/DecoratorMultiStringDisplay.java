import java.util.ArrayList;
import java.util.List;


public class DecoratorMultiStringDisplay extends DecoratorDisplay {

	List<String> content = new ArrayList<>();
	int column = 0;
	public DecoratorMultiStringDisplay() {
	}
	@Override
	public int getColumns() {
		return column;
	}

	@Override
	public int getRows() {
		return content.size();
	}

	@Override
	public String getRowText(int index) {
		String str = content.get(index);
		StringBuffer buffer = new StringBuffer(str);
		for(int i = 0; i < column - str.length(); i++)
			buffer.append(" ");
		return buffer.toString();
	}
	
	public void add(String str) {
		content.add(str);
		if(str.length() > column)
			column = str.length();
	}

}
