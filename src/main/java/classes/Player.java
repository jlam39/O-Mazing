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
	private Position p; //added position class, might want to use this
	private int speed; // added speed to Player class so it is easy to change
	private int ballSize;
	

public Player(int x, int y, int s, int ballSize) {
	this.x = x;
	this.y = y;
	this.speed = s;
	this.p = new Position(x, y); // initialized position
	this.ballSize = ballSize;
	this.setFocusable(true);
	this.addKeyListener(this);
}

public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.setColor(Color.RED);
	g.fillOval(x,  y, ballSize, ballSize);
}

//movement with a set speed of "speed"

public void moveLeft() {
	x -= speed;
	this.p = new Position(x, y);
	
}

public void moveRight() {
	x += speed;
	this.p = new Position(x, y);
}

public void moveUp () {
	y -= speed;
	this.p = new Position(x, y);
}

public void moveDown () {
	y += speed;
	this.p = new Position(x, y);
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
    this.setLocation(x,y); // Changes location of Player
    
    
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