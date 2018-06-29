
public class Director {
	private Builder builder;
		
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.buildTitle("Title");
		builder.buildString("This is the String");
		builder.buildItems(new String[] {
				"Morning",
				"Afternoon",
				"Evening"
		});
		
		builder.buildClose();
	}
}
