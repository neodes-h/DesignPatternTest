import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ElementArrayList extends ArrayList implements Element {

	@Override
	public void accept(Visitor v) {
		Iterator it = iterator();
		while(it.hasNext()) {
			Entry entry = (Entry) it.next();
			entry.accept(v);
		}
		
	}

}
