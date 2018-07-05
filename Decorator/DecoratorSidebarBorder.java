
public class DecoratorSidebarBorder extends DecoratorBorder {

	
	private char borderChar;
	public DecoratorSidebarBorder(DecoratorDisplay display, char ch) {
		super(display);
		this.borderChar = ch;
	}
	
	@Override
	public int getColumns() {
		return display.getColumns() + 2;
	}

	@Override
	public int getRows() {
		return display.getRows();
	}

	@Override
	public String getRowText(int index) {
		return borderChar + display.getRowText(index) + borderChar;
	}

}
