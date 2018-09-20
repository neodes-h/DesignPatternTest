
public class Flyweight_main {
	public static void main(String[] args) {
		long start =  getMemory();
		BigString bs = new BigString("1212123",true);
		System.out.println("Used:" + (getMemory() - start));
		bs.print();
	}
	public static long getMemory() {
		Runtime.getRuntime().gc();
		long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		return used;
	}
}
