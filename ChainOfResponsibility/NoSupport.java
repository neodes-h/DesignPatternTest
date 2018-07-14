
public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	@Override
	public boolean resolve(Trouble trouble) {
		return false;
	}

}
