/**
 * 
 */
package com.ss.week1.day2;

import com.ss.week1.day1.PrintPatterns;

/**
 * @author marvin
 *
 */
public class Triangle implements Shape {
	private Number base;
	private Number height;
	
	public Triangle(Number base, Number height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public Double calculateArea() {
		return 0.5 * base.doubleValue() * height.doubleValue();
	}

	@Override
	public void display() {
		PrintPatterns pp = new PrintPatterns();
		
		Double base = this.base.doubleValue();
		Double height = this.height.doubleValue();
		
		for (int i = 0; i < height; i++) {
			System.out.print("|");
			Double currentWidth = 2*i*base/height;
			if (i != height-1) {
				pp.printRepeat(" ", currentWidth.intValue());
			} else {
				pp.printRepeat("_", currentWidth.intValue());
			}
			System.out.print("\\");
			pp.printRepeat("_", (int)(double)(2*(i+1)*base/height - currentWidth - 1));
			System.out.println();
		}
		System.out.println("Triangle Area: " + calculateArea());
		
	}
	
	public Number getBase() {
		return base;
	}
	
	public void setBase(Number base) {
		this.base = base;
	}
	
	public Number getHeight() {
		return height;
	}
	
	public void setHeight(Number height) {
		this.height = height;
	}

}
