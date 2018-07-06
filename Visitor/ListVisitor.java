import java.util.Iterator;

public class ListVisitor extends Visitor {

	private String currDir = "";
	@Override
	public void visit(File file) {
		System.out.println(currDir + "/" + file);

	}

	@Override
	public void visit(Directory directory) {
		String savedDir = currDir;
		System.out.println(currDir + "/" + directory);
		currDir = currDir + "/" + directory.getName();
		Iterator it = (Iterator) directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)(it.next());
			entry.accept(this);
		}
		currDir = savedDir;
	}

}
