
public class newDisplayImpl2 extends DisplayImpl {
	
	private char start;
	private char decorator;
	private char end;
	public newDisplayImpl2(char start, char decortor, char end) {
		super();
		this.start = start;
		this.decorator = decortor;
		this.end = end;
	}

	@Override
	public void open() {
		System.out.print(start);
	}

	@Override
	public void print() {
		System.out.print(decorator+""+decorator);
	}

	@Override
	public void close() {
		System.out.println(end);
	}

}
