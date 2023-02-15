import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public abstract class Player extends JPanel implements KeyListener{
	private int x;
	private int y;
	private int ballSize;

public Player(int x, int y, int ballSize) {
	this.x = x;
	this.y = y;
	this.ballSize = ballSize;
	this.setFocusable(true);
	this.addKeyListener(this);
}

public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.RED);
	g.fillOval(x,  y, ballSize, ballSize);
}

public void moveLeft() {
	x -= 5;
}
}