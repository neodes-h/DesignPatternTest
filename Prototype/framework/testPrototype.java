package framework;

public class testPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		ManagerPrototype manager = new ManagerPrototype();
		UnderlinePen uPen = new UnderlinePen('~');
		MessageBox mBox = new MessageBox('*');
		MessageBox sBox = new MessageBox('#');
		
		manager.register("A", uPen);
		manager.register("B", mBox);
		manager.register("C", sBox);
		
		String s = "Henry";
		ProductPrototype p1 = manager.create("A");
		p1.use(s);
		ProductPrototype p2 = manager.create("B");
		p2.use(s);
		ProductPrototype p3 = manager.create("C");
		p3.use(s);
	}
}
