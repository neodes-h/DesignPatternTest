
public abstract class DecoratorBorder extends DecoratorDisplay {

	protected DecoratorDisplay display;
	protected DecoratorBorder(DecoratorDisplay display) {
		this.display = display;
	}

}
