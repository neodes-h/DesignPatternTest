
public class PrinterProxy implements Printable{

	Printable real;
	Class cls;
	String name;
	public PrinterProxy() {
		real = null;
	}
	
	public PrinterProxy(String name, Class cls) {
		this();
		this.name = name;
		this.cls = cls;
	}
	
	@Override
	public synchronized void setPrinterName(String name) {
		this.name = name;
		if(real != null)
			real.setPrinterName(name);
		
	}

	@Override
	public String getPrinterName() {
		return this.name;
	}

	@Override
	public void print(String string) {
		try {
			realize();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		real.print(string);
		
	}
	
	public synchronized void realize() throws InstantiationException, IllegalAccessException {
		if(real == null)
			real = (Printable)(cls.newInstance());
	}

}
