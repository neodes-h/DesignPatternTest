package command;

import java.util.Iterator;
import java.util.Stack;

public class MarcoCommand implements Command{

	private Stack<Command> commands = new Stack<>();
	
	@Override
	public void execute() {
		Iterator<Command> it = commands.iterator();
		while(it.hasNext()) {
			((Command)it.next()).execute();
		}
	}
	
	public void append(Command com) {
		if(com != this)
			commands.push(com);
	}
	
	public void undo() {
		if(!commands.isEmpty()) {
			commands.pop();
		}
	}
	
	public void clear() {
		commands.clear();
	}
	
}
