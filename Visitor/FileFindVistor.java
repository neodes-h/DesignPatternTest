import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVistor extends Visitor {

	private String suffix;
	private List<File> content;
	public FileFindVistor(String suffix) {
		this.suffix = suffix;
		content = new ArrayList<>();
	}
	@Override
	public void visit(File file) {
		if(file.getName().endsWith(suffix))
			content.add(file);

	}

	@Override
	public void visit(Directory directory) {
		Iterator<Entry> iterator = directory.iterator();
		while(iterator.hasNext()) {
			Entry entry = iterator.next();
			entry.accept(this);
		}
	}
	
	public Iterator<File> getFoundFiles(){
		return content.iterator();
	}

}
