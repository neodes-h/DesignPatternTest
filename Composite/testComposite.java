import java.util.Iterator;

public class testComposite {
	public static void main(String[] args) {
		System.out.println("Makeing root directory...");
		Directory root = new Directory("root");
		Directory bin = new Directory("bin");
		Directory tmp = new Directory("tmp");
		Directory usr = new Directory("usr");
		root.add(bin);
		root.add(tmp);
		root.add(usr);
		bin.add(new File("vi", 10000));
		bin.add(new File("latex",20000));
		root.printList();
		
		
		System.out.println("Making usr directory");
		Directory yuki = new Directory("yuku");
		Directory hanako = new Directory("hanako");
		Directory tomura = new Directory("tomura");
		
		yuki.add(new File("diary.html", 100));
		yuki.add(new File("Composite.java", 200));
		
		hanako.add(new File("memo.html", 300));
		
		tomura.add(new File("game.doc", 400));
		tomura.add(new File("junk.mail", 500));
		
		
		
		usr.add(yuki);
		usr.add(hanako);
		usr.add(tomura);
		System.out.println(tomura.getAbsolutePath());
		
		root.printList();
		System.out.println("HTML files are:");
		FileFindVistor visitor = new FileFindVistor(".html");
		root.accept(visitor);
		Iterator<File> it = visitor.getFoundFiles();
		while(it.hasNext()) {
			System.out.println(((File)it.next()).toString());
		}
	}
}
