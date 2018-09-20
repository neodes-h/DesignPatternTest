package Game;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
	private int money;
	private List<String> fruits = new ArrayList<>();
	private Random random = new Random();
	private static String[] fruitsname = {
			"apple","grape","banana","orange"
	};
	
	public Gamer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return this.money;
	}
	
	public String getFruit() {
		String prefix = "";
		if(random.nextBoolean())
			prefix = "delicious ";
		
		return prefix + fruitsname[random.nextInt(fruitsname.length)];
	}
	
	public void bet() {
		int dice = random.nextInt(6) + 1;
		if(dice == 1) {
			money += 100;
			System.out.println("Money increases.");
		} else if(dice == 2) {
			money /= 2;
			System.out.println("Money halves.");
		} else if(dice == 6) {
			String f = getFruit();
			System.out.println("Get fruit (" + f + ").");
			fruits.add(f);
		} else {
			System.out.println("Nothing happens.");
		}
	}
	
	
	public Memento createMemento() throws IOException {
		Memento m = new Memento(money);
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			String f = it.next();
			if(f.startsWith("delicious"))
				m.addFruit(f);
		}
		
		File file = new File("game.dat");
		if(!file.exists())
			file.createNewFile();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(m);
		oos.close();
		return m;
	}
	
	public void restoreMemento(Memento m) {
		this.money = m.getMoney();
		this.fruits = m.getFruits();
	}
	
	public String toString() {
		return "[Money= " + this.money + ", fruits= " + this.fruits + "]";
	}
	
}
