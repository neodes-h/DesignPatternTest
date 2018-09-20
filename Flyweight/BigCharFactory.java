import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
	public static BigCharFactory singleton = new BigCharFactory();
	private static Map<Character, BigChar> pool = new HashMap<>();
	private BigCharFactory() {}
	
	public static BigCharFactory getInstance() {
		return singleton;
	}
	
	public synchronized BigChar getBigChar(char charname) {
		if(!pool.containsKey(charname)) {
			BigChar c = new BigChar(charname);
			pool.put(charname, c);
		}
		
		return pool.get(charname);
	}
	
}
