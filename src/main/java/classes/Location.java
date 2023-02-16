package classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import acm.graphics.*;

public class Location extends JPanel {
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
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (t.getTerrainType() == Terrain_Type.wall) {
			g.setColor(Color.RED);
		}
		else {
			g.setColor(Color.WHITE);
		}
		
		g.fillRect(this.p.getX() - width/2, this.p.getY() + height/2, this.width, this.height);
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