/**
 * 
 */
package com.ss.week1.day2;

import com.ss.week1.day1.PrintPatterns;

/**
 * @author marvin
 *
 */
public class Rectangle implements Shape {
	private Number width;
	private Number height;
	
	public Rectangle(Number width, Number height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public Double calculateArea() {
		return width.doubleValue() * height.doubleValue();
	}

	@Override
	public void display() {
		PrintPatterns pp = new PrintPatterns();
		pp.printRepeatLine(" - ", width.intValue());
		for (int i = 0; i < height.intValue(); i++) {
			System.out.print("|");
			pp.printRepeat(" ", width.intValue()*3-2);
			System.out.println("|");
		}
		pp.printRepeatLine(" - ", width.intValue());
		System.out.println("Rectangle Area: " + calculateArea());
	}
	
	public Number getWidth() {
		return width;
	}
	
	public void setWidth(Number width) {
		this.width = width;
	}
	
	public Number getHeight() {
		return height;
	}
	
	public void setHeight(Number height) {
		this.height = height;
	}

}
