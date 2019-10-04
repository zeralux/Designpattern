package solid.ocp;

import java.util.ArrayList;

/*	Open Closed Principle
 * 
 * 	藉由增加程式來擴充功能，而並非修改程式
 * 	把所有需擴展的功能行為透過 interface 來定義，並且反轉兩邊的相依關係
 * 
 * */
public class Main {
	
	
	 public static void main(String[] args) {
		 
		 ArrayList<Shape> shapes = new ArrayList<Shape>(2);
		 
		 Circle circle = new Circle();
		 circle.setRadius(4);
		 shapes.add(circle);
		 
		 Square square = new Square();
		 square.setRadius(1);
		 shapes.add(square);
		 
		 AreaCalculator calculator = new AreaCalculator();
		 calculator.calculate( shapes.toArray(new Shape[shapes.size()]));
		 
	 }
}