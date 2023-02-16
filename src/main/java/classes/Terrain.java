package classes;

import acm.graphics.*;

public class Terrain {
	public Terrain_Type type;
	public Terrain(Terrain_Type t) {
		this.type = t;
	}
	public void set_type(Terrain_Type t) {
		this.type = t;
		
	}
	public Terrain_Type getTerrainType() {
		if (type.toString() == "path") {
			return Terrain_Type.path;
		}
		if (type.toString() == "wall") {
			return Terrain_Type.wall;
		}
		return Terrain_Type.wall;
	}
	
 


}