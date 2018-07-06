import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
	
	private String name;
	private List<Entry> directory = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		SizeVisitor visitor = new SizeVisitor();
		visitor.visit(this);
		
		return visitor.getSize();
	}
	
	public Entry add(Entry entry) {
		directory.add(entry);
		entry.setParent(this);
		return this;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		for(Entry entry : directory) {
			entry.printList(prefix + "/" + name);
		}

	}
	
	public Iterator<Entry> iterator() {
		return directory.iterator();
	}
	
	@Override
	public void accept(Visitor v) throws FileTreatmentException {
		v.visit(this);
	}

}
