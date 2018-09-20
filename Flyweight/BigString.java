
public class BigString {
	private BigChar[] bigChars;
	
	
	public BigString(String string, boolean shared) {
		bigChars = new BigChar[string.length()];
		int i = 0;
		if(shared) {
			BigCharFactory factory = BigCharFactory.getInstance();
			for(char ch:string.toCharArray()) {
				bigChars[i++] = factory.getBigChar(ch);
			}
		} else {
			for(char ch:string.toCharArray()) {
				bigChars[i++] = new BigChar(ch);
			}
		}
		
	}
	
	public void print() {
		for(BigChar bc : bigChars)
			bc.print();
	}
}
