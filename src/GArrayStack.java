//	Kuangjie Sima
//	1/10/2014
//	CSE 332 BC
//	Aaron Nech
//	Project 1

import java.util.EmptyStackException;

/**
 * Generic Stack Using arrays
 */
public class GArrayStack<T> implements GStack<T> {
	private T[] data;
	private int sizeOfStack;
	
	public GArrayStack(){
		data = (T[]) new Object[10];
		sizeOfStack = 0;
	}
	
	@Override
	public boolean isEmpty() {
		return sizeOfStack == 0;
	}

	@Override
	public void push(T d) {
		if (sizeOfStack == data.length - 1)
			doubleArray();
		data[sizeOfStack++] = d;
	}

	@Override
	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();
		return data[--sizeOfStack];
	}

	@Override
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return data[sizeOfStack - 1];
	}
	
	private void doubleArray() {
		T[] newData = (T[]) new Object[sizeOfStack * 2];
		for (int i = 0; i < sizeOfStack; i++)
			newData[i] = data[i];
		data = newData;
	}
}
