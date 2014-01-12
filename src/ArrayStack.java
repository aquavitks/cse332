//	Kuangjie Sima
//	1/10/2014
//	CSE 332 BC
//	Aaron Nech
//	Project 1

import java.util.EmptyStackException;

/**
 * Stack of double Using array
 */
public class ArrayStack implements DStack {
	private double[] data;
	private int sizeOfStack;
	
	//	post: initializes array and sizeOfStack
	public ArrayStack(){
		data = new double[10];
		sizeOfStack = 0;
	}
	
	//	post: returns whether stack is empty
	public boolean isEmpty() {
		return sizeOfStack == 0;
	}

	//	post: push a element into stack
	public void push(double d) {
		//	doubles the size of array if off current size limit
		if (sizeOfStack == data.length - 1)
			doubleArray();
		data[sizeOfStack++] = d;
	}

	//	pre: stack is not empty, otherwise throws EmptyStackException
	//	post: returns and pops out the element on the top of stack
	public double pop() {
		if (isEmpty())
			throw new EmptyStackException();
		return data[--sizeOfStack];
	}

	//	pre: stack is not empty, otherwise throws EmptyStackException
	//	post: returns the element on the top of stack
	public double peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return data[sizeOfStack - 1];
	}
	
	//	post: doubles the array size
	private void doubleArray() {
		double[] newData = new double[sizeOfStack * 2];
		for (int i = 0; i < sizeOfStack; i++)
			newData[i] = data[i];
		data = newData;
	}

}
