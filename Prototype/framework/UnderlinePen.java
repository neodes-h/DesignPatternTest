package framework;

public class UnderlinePen extends ProductPrototype {
	
	private char ulchar;
	
	public UnderlinePen(char ch) {
		this.ulchar = ch;
	}
	
	@Override
	public void use(String s) {
		System.out.println("\"" + s + "\"");
		for(int i = 0; i < s.length() + 2; i++)
			System.out.print(ulchar);
		System.out.println("");

	}


}
