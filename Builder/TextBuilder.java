
public class TextBuilder extends Builder {
	
	private StringBuffer sb = new StringBuffer();

	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		sb.append("===================\n");
		sb.append("[" + title + "]\n");
		sb.append("\n");
		
	}

	@Override
	public void makeString(String string) {
		sb.append("#" + string + "\n");

	}

	@Override
	public void makeItems(String[] items) {
		for(String item : items) {
			sb.append("   *" + item + "\n");
		}
		sb.append("\n");

	}

	@Override
	public void close() {
		sb.append("===================\n");
	}
	
	public String getResult() {
		return sb.toString();
	}

}
