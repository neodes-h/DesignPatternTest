
public abstract class Builder {
	
	private boolean flag = false;
	public void buildTitle(String title) {
		if(!flag) {
			makeTitle(title);
			flag = true;
		}
	}
	
	public void buildString(String string) {
		if(flag) {
			makeString(string);
		}
	}
	
	public void buildItems(String[] items) {
		if(flag) {
			makeItems(items);
		}
	}
	
	public void buildClose() {
		if(flag) {
			close();
		}
	}
	
	protected abstract void makeTitle(String title);
	protected abstract void makeString(String string);
	protected abstract void makeItems(String[] items);
	protected abstract void close();
}
