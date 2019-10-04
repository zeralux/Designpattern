package solid.ocp;

public class AreaCalculator {
	public void calculate(Shape[] shapes)
    {
        for(Shape shape:shapes) {
        	System.out.println(shape.area());	
        }
    }
}
