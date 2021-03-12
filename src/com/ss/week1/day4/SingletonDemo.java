/**
 * 
 */
package com.ss.week1.day4;

/**
 * @author marvin
 *
 */
public class SingletonDemo {
	
	private static SingletonDemo instance = null;
	
	private SingletonDemo() {
		
	}
	
	public static SingletonDemo getInstance() {
		if (instance == null) {
			synchronized (SingletonDemo.class) {
				if (instance == null) {
					instance = new SingletonDemo();
				}
			}
		}
		
		return instance;
	}
	
}
