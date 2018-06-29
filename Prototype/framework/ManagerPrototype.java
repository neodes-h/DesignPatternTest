package framework;

import java.util.HashMap;
import java.util.Map;

public class ManagerPrototype {
	Map<String, ProductPrototype> showcase;
	public ManagerPrototype() {
		showcase = new HashMap<>();
	}
	
	public void register(String name, ProductPrototype value) {
		showcase.put(name, value);
	}
	
	public ProductPrototype create(String name) throws CloneNotSupportedException {
		ProductPrototype p = showcase.get(name);
		return p.createClone();
	}
}
