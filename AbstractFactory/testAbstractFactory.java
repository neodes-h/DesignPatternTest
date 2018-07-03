import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

public class testAbstractFactory {
	public static void main(String[] args) {
//		Factory factory = Factory.getFactory("listfactory.ListFactory");
		Factory factory = Factory.getFactory("tablefactory.TableFactory");
		Link people = factory.createLink("Newspaper 1","www.people.com.cn");
		Link gmw = factory.createLink("Newspaper 2", "www.gmw.cn");
		
		Link us_yahoo = factory.createLink("Yahoo!", "www.yahoo.com");
		Link jp_yahoo = factory.createLink("Yahoo! Japan", "www.yahoo.co.jp");
		Link excite = factory.createLink("Excite", "www.excite.com");
		Link google = factory.createLink("Google!", "www.google.com");
		
		
		Tray traynews = factory.createTray("News");
		traynews.add(people);
		traynews.add(gmw);
		
		Tray trayyahoo = factory.createTray("Yahoo");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);
		
		Tray traysearch = factory.createTray("Search Engines");
		traysearch.add(excite);
		traysearch.add(google);
		traysearch.add(trayyahoo);
		
		Page page = factory.createPage("LinkPage", "Henry");
		page.add(traynews);
		page.add(traysearch);
		page.output();
	}
}
