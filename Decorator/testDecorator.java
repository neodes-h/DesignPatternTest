
public class testDecorator {

	public static void main(String[] args) {
		DecoratorDisplay d1 = new DecoratorStringDisplay("Hello World");
		DecoratorDisplay d2 = new DecoratorSidebarBorder(d1, '#');
		DecoratorDisplay d3 = new DecoratorFullBorder(d2);
		
		d1.show();
		d2.show();
		d3.show();

		DecoratorDisplay d4 = new DecoratorSidebarBorder(
								new DecoratorFullBorder(
										new DecoratorFullBorder(
												new DecoratorSidebarBorder(
														new DecoratorFullBorder(
																new DecoratorStringDisplay("Hello world")
																), 
														'*')
												)), 
										'/');
		
		d4.show();
		
	}

}
