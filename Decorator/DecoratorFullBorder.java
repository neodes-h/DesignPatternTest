
public class DecoratorFullBorder extends DecoratorBorder {

	public DecoratorFullBorder(DecoratorDisplay display) {
		super(display);
	}
	
	@Override
	public int getColumns() {
		return display.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return display.getRows() + 2;
	}

	@Override
	public String getRowText(int index) {
		if(index == 0 || index == display.getRows() + 1) 
			return "+" + makeLine('-', display.getColumns()) + "+";
		else 
			return "|" + display.getRowText(index-1) + "|";
	}
	
	private String makeLine(char ch, int count) {
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < count; i++)
			buffer.append(ch);
		
		return buffer.toString();
	}

}
