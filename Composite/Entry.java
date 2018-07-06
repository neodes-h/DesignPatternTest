import java.util.Iterator;

public abstract class Entry implements Element{
	private Entry parent;
	public abstract String getName();
	public abstract int getSize();
	public void printList() {
		printList("");
	}
	protected abstract void printList(String prefix);
	
	
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
	
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}
	
	public Entry getParent() {
		return parent;
	}
	
	public void setParent(Entry parent) {
		this.parent = parent;
	}
	
	public String getAbsolutePath() {
		if(parent == null) {
			return "/" + getName();
		} else {
			return getParent().getAbsolutePath() + "/" + getName();
		}
	}
	
	public Iterator iterator() throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	

	
}
