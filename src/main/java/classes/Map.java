package classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Timer;

import acm.program.GraphicsProgram;
import edu.pacific.comp55.starter.GraphicsApplication;
import edu.pacific.comp55.starter.MainApplication;

public class Map extends GraphicsApplication implements ActionListener, KeyListener {
	// Map will be a grid with grid blocks
	
	// Size of the Map
	private int column;
	private int row;
	private Location[][] size;
	private int block_width = 10;
	private int block_height = 10;
	private ArrayList<Position> p = new ArrayList<Position>();
	
	Map(int c, int r){
		this.column = c;
		this.row = r;
		this.size = new Location[r][c];
		
		for (int i = 0; i < 10; i++) {
			p.add(new Position(30, i * 10));
			p.add(new Position(40, i * 10));
		}
		
		for (int j = 0; j < row; j ++) {
			for (int k = 0; k < column; k++) {
				size[j][k] = new Location(new Terrain(), new Position(j * 10,k * 10), new Buff_Debuff());
				
			}
		}
	}

	
	
	// Default, each coordinate will have a terrain value of Barrier
	

	
	
	// Go through an array of location of path
	// if coordinate in path array, then make terrain a path
	
	// Go through debuff array, if location matches put a buff or debuff
	
	
	
	
	

	@Override
	public void run() {
		
		
	}
	
	public static void main(String args[]) {
		
	}


}