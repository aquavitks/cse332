//	Kuangjie Sima
//	1/10/2014
//	CSE 332 BC
//	Aaron Nech
//	Project 1

import java.util.EmptyStackException;

/**
 * Stack of double Using Linked Lists
 */
public class ListStack implements DStack {
	ListNode top;

	//	post: initializes the stack
	public ListStack() {
		top = null;
	}
	
	//	post: returns whether stack is empty
	public boolean isEmpty() {
		return top == null;
	}

	//	post: push the new element into the stack
	public void push(double d) {
		if (isEmpty()) {
			top = new ListNode(d);
		} else {
			top = new ListNode(d, top);
		}
	}

	//	pre: stack is not empty, otherwise throws EmptyStackException
	//	post: returns and pops out the element on the top of stack
	public double pop() {
		if (isEmpty())
			throw new EmptyStackException();
		double data = top.data;
		top = top.next;
		return data;
	}

	//	pre: stack is not empty, otherwise throws EmptyStackException
	//	post: return the element on the top of stack
	public double peek() {
		if (isEmpty())
			throw new EmptyStackException();
		return top.data;
	}
	
	//	ListNode with data of double
	class ListNode {
		public double data;
		public ListNode next;
		
		//	construct the listNode with data and next node
		public ListNode(double data, ListNode next) {
			this.data = data;
			this.next = next;
		}

		//	construct the ListNode with data and null for next
		public ListNode(double data) {
			this(data, null);
		}
		
		//	construct the ListNode with data 0 and null next
		public ListNode() {
			this(0, null);
		}
	}
}


