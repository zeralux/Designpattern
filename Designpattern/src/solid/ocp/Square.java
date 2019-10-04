package solid.ocp;

import lombok.Data;

@Data
public class Square implements Shape{
	
	private double radius;
	
	@Override
	public double area() {
		return radius*radius;
	}

}
