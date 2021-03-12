/**
 * 
 */
package com.ss.week1.day4;

/**
 * @author marvin
 *
 */
public class ProducerConsumerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Buffer<Integer> buffer = new Buffer<>(10);
		
		Runnable producer = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					synchronized (buffer) {
						try {
							buffer.add(1);
							System.out.println("Producer added to buffer");
						} catch (IllegalStateException ise) {
							System.out.println(ise.getMessage());
						}
						System.out.println(buffer);
					}
				}
			}
		};
		
		Runnable consumer = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					synchronized (buffer) {
						try {
							buffer.remove();
							System.out.println("Consumer removed from buffer");
						} catch (IllegalStateException ise) {
							System.out.println(ise.getMessage());
						}
						System.out.println(buffer);
					}
				}
			}
		};
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
