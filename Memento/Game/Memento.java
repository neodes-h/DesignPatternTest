package Game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Memento implements Serializable{
	int money;
	ArrayList<String> fruits;
	public int getMoney() {
		return this.money;
	}
	
	public Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<>();
	}
	
	void addFruit(String fruit) {
		this.fruits.add(fruit);
	}
	
	List getFruits() {
		return this.fruits;
	}
	
}
