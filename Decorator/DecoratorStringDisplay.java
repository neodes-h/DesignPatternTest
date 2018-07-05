
public class DecoratorStringDisplay extends DecoratorDisplay {
	private String string;
	
	public DecoratorStringDisplay(String string) {
		this.string = string;
	}
	@Override
	public int getColumns() {
		return string.getBytes().length;
	}

	@Override
	public int getRows() {
		return 1;
	}

	@Override
	public String getRowText(int index) {
		return index == 0 ? string : null;
	}

}
