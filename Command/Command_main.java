import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import command.Command;
import command.DrawCommand;
import command.MarcoCommand;
import drawer.DrawCanvas;

public class Command_main extends JFrame implements ActionListener{

	private MarcoCommand history = new MarcoCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("Clear");
	private JButton undoButton = new JButton("Undo");
	
	public Command_main(String title) {
		super(title);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				Command command = new DrawCommand(canvas, e.getPoint());
				history.append(command);
				command.execute();
				
			}
		});
		clearButton.addActionListener(this);
		undoButton.addActionListener(this);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(undoButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		pack();
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == clearButton) {
			history.clear();
			canvas.repaint();
		} else if(e.getSource() == undoButton) {
			history.undo();
			canvas.repaint();
		}
		
	}
	public static void main(String[] args) {
		new Command_main("Command pattern sample");
	}
	
}
