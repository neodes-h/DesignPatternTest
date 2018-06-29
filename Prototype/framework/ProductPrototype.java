package framework;

public abstract class ProductPrototype implements Cloneable {
	public abstract void use(String s);
	public ProductPrototype createClone() throws CloneNotSupportedException{
		return (ProductPrototype) clone();
	}
	
}
