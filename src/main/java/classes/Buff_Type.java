package classes;

public enum Buff_Type {

	O1, logN, N2, None;

	public String toString() {
		switch (this) {
		case O1:
			return "O1";
		case logN:
			return "logN";
		case N2:
			return "N2";
		case None:
			return "None";
		}

			
		return "n/a";
	}

}
