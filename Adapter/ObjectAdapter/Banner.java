package ObjectAdapter;

public class Banner {
	private String banner;
	public Banner(String banner) {
		this.banner = banner;
	}
	
	public void showWithParen() {
		System.out.println("(" + this.banner + ")");
	}
	
	public void showWithAster() {
		System.out.println("*" + this.banner + "*");
	}
}
