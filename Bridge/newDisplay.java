
public class newDisplay extends Display {

	private int times;
	public newDisplay(DisplayImpl impl, int times) {
		super(impl);
		this.times = times;
	}
	
	
	public void decorateDisplay() {
		for(int i = 0; i < times; i++) {
			open();
			for(int j = 0; j < i; j++)
				print();
			close();
		}
	}
	
	
	
}
