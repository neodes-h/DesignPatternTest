
public class testDecorator {

	public static void main(String[] args) {
		DecoratorDisplay d1 = new DecoratorStringDisplay("Hello World");
		DecoratorDisplay d2 = new DecoratorUpDowmBorder(d1, '#');
		DecoratorDisplay d3 = new DecoratorFullBorder(d2);
		
		d1.show();
		d2.show();
		d3.show();

		DecoratorDisplay d4 = new DecoratorFullBorder(
								new DecoratorUpDowmBorder(
										new DecoratorSidebarBorder(
												new DecoratorUpDowmBorder(
														new DecoratorSidebarBorder(
																new DecoratorStringDisplay("Hello World"),
																'*'),
														'='), 
												'|'), 
										'/')
								);
				
		
		d4.show();
		
		DecoratorMultiStringDisplay d5 = new DecoratorMultiStringDisplay();
		d5.add("Good Morning");
		d5.add("Good Noon");
		d5.add("Good Evening");
		
		d5.show();
		DecoratorFullBorder d6 = new DecoratorFullBorder(d5);
		d6.show();
		
	}

}
