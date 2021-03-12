/**
 * 
 */
package com.ss.week1.day2;

/**
 * @author marvin
 *
 */
public class Circle implements Shape {
	private Number radius;
	
	public Circle(Number radius) {
		this.radius = radius.doubleValue();
	}

	@Override
	public Double calculateArea() {
		return Math.PI * Math.pow(radius.doubleValue(), 2);
	}

	@Override
	public void display() {
		Integer diameter = (int)(radius.doubleValue()*2);
		Integer r = radius.intValue();
		for (int y = 0; y <= diameter; y++) {
			for (int x = 0; x <= diameter; x++) {
				// (x-h)^2 + (y-v)^2 = r^2
				if (Math.pow(x-r, 2) + Math.pow(y-r, 2) >= Math.pow(r, 2)-r/2 && 
						Math.pow(x-r, 2) + Math.pow(y-r, 2) <= Math.pow(r, 2)+r/2) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("Circle Area: " + calculateArea());
	}
	
	public Number getRadius() {
		return radius;
	}
	
	public void setRadius(Number radius) {
		this.radius = radius;
	}

}
