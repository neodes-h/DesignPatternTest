package factory;

public abstract class Item {
	protected String caption;
	public Item(String string) {
		this.caption = string;
	}
	
	public abstract String makeHTML();
}
