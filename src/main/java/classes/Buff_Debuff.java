package classes;

import acm.graphics.*;

public class Buff_Debuff {
	public Buff_Type type;
	
	public Buff_Type getBuffType() {
		if (type.toString() == "O1") {
			return Buff_Type.O1;
		}
		if (type.toString() == "logN") {
			return Buff_Type.logN;
		}
		if (type.toString() == "N2") {
			return Buff_Type.N2;
		}
		return Buff_Type.None;
	}



}