package stack;

public class StackPackg 
{
	    private int arr[];
	    private int top;
	    private int capacity;
	 
	    StackPackg(int size)
	    {
	        arr = new int[size];
	        capacity = size;
	        top = -1;
	    }
	 	
	    
	    
	    public void push(int x)
	    {
	        if (isFull())
	        {
	        	System.out.println("OVERFLOW");
	        }
	        else
	        {
	        arr[++top] = x;
	        System.out.println("pushed " + x);
	    }
	    }
	 
	    public int pop()
	    {
	        if (isEmpty())
	        {
	            return 0;
	        }
	 
	        else
	        {
	        System.out.println("Removing " + peek());
	        return arr[top--];
	    }
	    }
	    public int peek()
	    {
	        if (!isEmpty())
	            return arr[top];
	        else
	            System.exit(1);
	 
	        return -1;
	    }
	    public int size()
	    {
	        return top + 1;
	    }
	 
	    public Boolean isEmpty()
	    {
	        return top == -1;    
	    }
	    public Boolean isFull()
	    {
	        return top == capacity - 1;    
	    }
	    
	}

