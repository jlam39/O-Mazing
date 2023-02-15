package classes;

import acm.graphics.*;

public class Terrain {
	public Terrain_Type type;
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