package classes;

public enum Terrain_Type {

	path, wall;

	public String toString() {
		switch (this) {
		case path:
			return "path";
		case wall:
			return "wall";
		}
		
		return "n/a";
	}

}
