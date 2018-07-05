
public abstract class DecoratorDisplay {
	public abstract int getColumns();
	public abstract int getRows();
	public abstract String getRowText(int index);
	public void show() {
		for(int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
