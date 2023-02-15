package classes;

import acm.graphics.*;

public class Location {
	private Terrain t;
	private Position p; 
	private Buff_Debuff b;
	
	// initialize
	Location(Terrain terr, Position pos, Buff_Debuff buff){
		t = terr;
		p = pos;
		b = buff;
		
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
	
 


}