//	Kuangjie Sima
//	1/10/2014
//	CSE 332 BC
//	Aaron Nech
//	Project 1

import java.util.EmptyStackException;


public class GListStack<T> implements GStack<T> {
	ListNode<T> top;

	public GListStack() {
		top = null;
	}
	
	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void push(T d) {
		if (isEmpty()) {
			top = new ListNode<T>(d);
		} else {
			top = new ListNode<T>(d, top);
		}
	}

	@Override
	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();
		T data = top.data;
		top = top.next;
		return data;
	}

	@Override
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return top.data;
	}

	class ListNode<T> {
		public T data;
		public ListNode<T> next;
	
		public ListNode(T data, ListNode<T> next) {
			this.data = data;
			this.next = next;
		}

		public ListNode(T data) {
			this(data, null);
		}
	
		public ListNode() {
			this(null, null);
		}
	}
}

