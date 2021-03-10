/**
 * 
 */
package com.ss.week1.day2;

/**
 * @author marvin
 *
 */
public class ShapeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape[] shapes = {new Rectangle(10, 5), new Circle(4), new Triangle(5, 10)};
		
		for (Shape shape : shapes) {
			shape.display();
		}
	}

}
