package classes;

import acm.graphics.*;

public class Location {
	private Terrain t;
	private Position p; 
	private Buff_Debuff b;
	private int width = 10;
	private int height = 10;
	GRect block;
	// initialize
	Location(Terrain terr, Position pos, Buff_Debuff buff){
		this.t = terr;
		this.p = pos;
		this.b = buff;
		block = new GRect(this.p.getX() - width/2, this.p.getY() + height/2, width, height);
	}
	
	//setters
	void set_Terrain(Terrain terr) {
		this.t = terr;
	}
	void set_Position(Position pos) {
		this.p = pos;
	}
	void set_buff(Buff_Debuff buff) {
		this.b = buff;
		
	}
	
	
	// getters
	
	Terrain get_Terrain() {
		return t;
	}
	Position get_Position() {
		return p;
	}
	Buff_Debuff get_buff() {
		return b;
	}
	
	//Create an Image 
	
 


}