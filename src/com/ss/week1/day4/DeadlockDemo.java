/**
 * 
 */
package com.ss.week1.day4;

/**
 * @author marvin
 *
 */
public class DeadlockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "s1";
		String s2 = "s2";

		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				String name = "Thread 1";

				try {
					System.out.println(name + " is waiting for object 1");
					synchronized (s1) {
						System.out.println(name + " is using object 1");
						Thread.sleep(100);
						System.out.println(name + " is waiting for object 2");
						synchronized (s2) {
							System.out.println(name + " is using object 2");
							System.out.println(name + " is done with object 2");
						}
						System.out.println(name + " is done with the object 1");
					}
				} catch (Exception e) {

				}
			}
		};

		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				String name = "Thread 2";

				try {
					System.out.println(name + " is waiting for object 2");
					synchronized (s2) {
						System.out.println(name + " is using object 2");
						Thread.sleep(100);
						System.out.println(name + " is waiting for object 1");
						synchronized (s1) {
							System.out.println(name + " is using object 1");
							System.out.println(name + " is done with object 1");
						}
						System.out.println(name + " is done with object 2");
					}
				} catch (Exception e) {

				}
			}
		};

		new Thread(r1).start();
		new Thread(r2).start();

	}

}
