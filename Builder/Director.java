
public class Director {
	private Builder builder;
		
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Title");
		builder.makeString("This is the String");
		builder.makeItems(new String[] {
				"Morning",
				"Afternoon",
				"Evening"
		});
		
		builder.close();
	}
}
