//	Kuangjie Sima
//	1/10/2014
//	CSE 332 BC
//	Aaron Nech
//	Project 1

/**
 * Interface for a stack of primitive doubles.
 * @version CSE 332 13au
 * 
 * NOTE: The comments for this interface are horrible! You will
 *       need to write something better for your implementations.
 */
public interface DStack {
    /** 
     * is empty?
     */
    public boolean isEmpty();

    /**
     * push
     */
    public void push(double d);

    /**
     * pop
     * @return the deleted value
     * @throws EmptyStackException if stack is empty
     */
    public double pop();

    /**
     * peek
     * @throws EmptyStackException if stack is empty
     */
    public double peek();
}
