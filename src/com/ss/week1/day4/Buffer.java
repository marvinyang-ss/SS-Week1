/**
 * 
 */
package com.ss.week1.day4;

import java.util.LinkedList;
import java.util.List;

/**
 * @author marvin
 *
 */
public class Buffer<E> {
	
	private Integer capacity;
	private List<E> queue = new LinkedList<>();
	
	public Buffer(int capacity) {
		this.capacity = capacity;
	}
	
	public void add(E item) throws IllegalStateException {
		if (queue.size() < capacity) {
			queue.add(item);
		} else {
			throw new IllegalStateException("Attempted to add to full buffer");
		}
	}
	
	public E remove() throws IllegalStateException {
		if (queue.size() > 0) {
			return queue.remove(0);
		} else {
			throw new IllegalStateException("Attempted to remove from empty buffer");
		}
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	public Integer getSize() {
		return queue.size();
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append("[");
		for (int i = 0; i < capacity; i++) {
			if (i < queue.size())
				result.append(queue.get(i) + ", ");
			else
				result.append(" , ");
		}
		result.replace(result.length()-2, result.length()-1, "]");
		
		return result.toString();
	}

}
