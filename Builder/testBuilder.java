
public class testBuilder {

	public static void main(String[] args) {
		if(args[0].equals("plain")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			
			System.out.println(textBuilder.getResult());
		} else if(args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			
			System.out.println(htmlBuilder.getResult() + " finished");
		}
	}
	

}