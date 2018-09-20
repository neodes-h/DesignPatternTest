package Game;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Memento_main {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		File file = new File("game.dat");
		Gamer gamer = new Gamer(100);
		Memento memento;
		if(!file.exists()) {
			memento = gamer.createMemento();
		} else {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			memento = (Memento) ois.readObject();
			ois.close();
			gamer.restoreMemento(memento);
		}
			
		for(int i = 0; i < 100; i++) {
			System.out.println("==== " + i);
			System.out.println("Current status:" + gamer);
			
			gamer.bet();
			System.out.println("Money held:" + gamer.getMoney() + " dollar");
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("Money increases, so store the current status");
				memento = gamer.createMemento();
			} else if(gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("Money decreases a lot, so restore the memento");
				gamer.restoreMemento(memento);
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("");
		}
	}
}
