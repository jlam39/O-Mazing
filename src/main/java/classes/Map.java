package classes;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
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
				size[j][k] = new Location(new Terrain(Terrain_Type.wall), new Position(j * 10,k * 10), new Buff_Debuff());
				for (int i = 0; i < p.size(); i++) {
					if (p.get(i).getX() == j && p.get(i).getY() == k) {
						size[j][k].set_Terrain(new Terrain(Terrain_Type.path));
						
					}
				}
				
			}
			
		}
	}

	
	
	// Default, each coordinate will have a terrain value of Barrier
	

	
	
	// Go through an array of location of path
	// if coordinate in path array, then make terrain a path
	
	// Go through debuff array, if location matches put a buff or debuff
	
	//getters
	private Location[][] get_size(){
		return this.size;
	}
	
	
	
	

	@Override
	public void run() {
		Map m = new Map(10,10);
		
		

		
	}
	
	public static void main(String args[]) {
		Map m = new Map(10,10);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j ++) {
				System.out.print(m.get_size()[i][j]);
			}
		}
		
		
	}


}