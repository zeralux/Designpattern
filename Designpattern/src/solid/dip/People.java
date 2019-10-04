package solid.dip;

import lombok.Data;
import solid.ocp.Circle;

@Data
public class People {
	private Stuffer stuffer;
	
	public People() {
	}
	
	public void eat() {
		stuffer.stuff();
	}
}
