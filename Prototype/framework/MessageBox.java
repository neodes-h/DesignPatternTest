package framework;

public class MessageBox extends ProductPrototype {
	
	private char decochar;
	
	public MessageBox(char ch) {
		decochar = ch;
	}

	@Override
	public void use(String s) {
		for(int i = 0; i < s.length() + 2; i++)
			System.out.print(decochar);
		System.out.println("");
		System.out.println(decochar + s + decochar);
		for(int i = 0; i < s.length() + 2; i++)
			System.out.print(decochar);
		System.out.println("");
		
	}


}
