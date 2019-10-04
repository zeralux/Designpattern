package solid.ocp;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Circle implements Shape{
	
	private double radius;
	
	@Override
	public double area() {
		return 4*Math.PI*radius*radius;
	}
	

}
