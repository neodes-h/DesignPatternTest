
public class StringDisplay extends AbstractDisplay {
	String string;
	public StringDisplay(String string) {
		this.string = string;
	}
	@Override
	public void open() {
		System.out.print("+");
		for(int i = 0; i < this.string.length(); i++)
			System.out.print("-");
		System.out.println("+");

	}

	@Override
	public void print() {
		System.out.println("|" + this.string + "|");

	}

	@Override
	public void close() {
		System.out.print("+");
		for(int i = 0; i < this.string.length(); i++)
			System.out.print("-");
		System.out.println("+");
	}

}
