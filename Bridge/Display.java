
public class Display {
	private DisplayImpl impl;
	public Display(DisplayImpl impl) {
		this.impl = impl;
	}
	
	public void open() {
		impl.open();
	}
	
	public void print() {
		impl.print();
	}
	
	public void close() {
		impl.close();
	}
	
	public final void display() {
		open();
		print();
		close();
	}
}
