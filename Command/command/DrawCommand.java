package command;

import java.awt.Point;

import drawer.Drawable;

public class DrawCommand implements Command{

	protected Drawable drawable;
	private Point position;
	public DrawCommand(Drawable drawable, Point point) {
		this.drawable = drawable;
		this.position = point;
	}
	
	@Override
	public void execute() {
		this.drawable.draw(position.x, position.y);
		
	}

}
