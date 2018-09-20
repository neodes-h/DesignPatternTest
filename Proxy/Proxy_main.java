
public class Proxy_main {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice", Printer.class);
		System.out.println("Current name:" + p.getPrinterName());
		p.setPrinterName("Bob");
		System.out.println("Current name:" + p.getPrinterName());
		p.print("Hello world"   );
		
	}
}
