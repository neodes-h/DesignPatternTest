
public abstract class Support {
	private String name;
	private Support next;
	
	public Support(String name) {
		this.name = name;
	}
	
	public Support next(Support next) {
		this.next = next;
		return next;
	}
	
	public final void support(Trouble trouble) {
		Support cur = this;
		while(true) {
			if(cur.resolve(trouble)) {
				cur.done(trouble);
				break;
			} else {
				if(cur.next != null)
					cur = cur.next;
				else {
					cur.fail(trouble);
					break;
				}
			}
		}
	}
	
	public String toString() {
		return "[" + this.name + "]";
	}
	
	public abstract boolean resolve(Trouble trouble);
	
	protected void done(Trouble trouble) {
		System.out.println(trouble + "is resolved by" + this + ".");
	}
	
	protected void fail(Trouble trouble) {
		System.out.println(trouble + "cannot be resolved.");
	}
}
