package classes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Player extends JPanel implements KeyListener{
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

public void moveRight() {
	x += 5;
}

public void moveUp () {
	y -= 5;
}

public void moveDown () {
	y += 5;
}
@Override
public void keyPressed(KeyEvent e) {
    int keyCode = e.getKeyCode();
    if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_A) {
        moveLeft();
    } else if (keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_D) {
        moveRight();
    } else if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_W) {
        moveUp();
    } else if (keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_S) {
        moveDown();
    }
    
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}