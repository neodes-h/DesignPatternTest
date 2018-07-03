package factory;

public abstract class Factory {
	public static Factory getFactory(String className) {
		Factory factory = null;
		try {
			factory = (Factory)(Class.forName(className).newInstance());
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	public void createYahooPage() {
		Page page = createPage("Yahoo", "Yahoo");
		page.add(createLink("Yahoo!", "http://www.yahoo.com"));
		page.output();
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
