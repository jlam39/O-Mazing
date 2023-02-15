package classes;

import acm.graphics.*;

public class Position {
	private int x;
	private int y;
	
	Position(int X, int Y){
		this.x = X;
		this.y = Y;
		
	}
	void setX(int X) {
		this.x = X;
	}
	void setY(int Y) {
		this.y = Y;
	}
	
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	



}