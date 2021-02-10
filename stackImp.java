package stack;

import java.util.Scanner;

public class stackImp
{
	static int stack[],TOP=-1,size ;;
	static Scanner in =new Scanner(System.in);
	static
	{
	stackImp.create();
	}
	public static void main(String[] args) {
		int item;
		while(true)
		{
		System.out.println("1-PUSH");
		System.out.println("2-POP");
		System.out.println("3-PEEK");
		System.out.println("4-IsEmpty");
		System.out.println("5-Exit");
		System.out.println("Enter your choice");
		int ch=in.nextInt();		
		switch(ch)
		{
		case 1:
			System.out.print("Enter the Element to push");
			item=in.nextInt();
			push(item);
			for(int i : stack)
			System.out.print(i+" ");
			System.out.println();
			break;
		case 2:
			item=pop();
			if(item==0)
				System.out.println("UNDERFLOW");
			else
				System.out.println("Popped item"+item);
			for(int i : stack)
				System.out.print(i+" ");
			System.out.println();
			break;
		case 3:
			item=peek();
			if(item==0)
				System.out.println("UNDERFLOW");
			else
				System.out.println("Peek item"+item);
			for(int i : stack)
				System.out.print(i+" ");
			System.out.println();
			break;
		case 4:
			if(IsEmp())
				
				System.out.println("Stack is Empty");
			else
				System.out.println("Stack is Not Empty");
			
			break;
		case 5:
			System.exit(1);
			break;
			default:
				System.out.println("Invalid choice");
				
		}
		}


	}
	static void create()
	{
		
		System.out.println("Enter the size");
		size=in.nextInt();
		stack=new int[size];
		System.out.println(" Stack Created");
	}
		static void push(int ele) {
			if(Isfull())
			{
			System.out.println("OVERFLOW");
			}
			else {
				stack[++TOP]=ele;
				
				
			}	
}
		static int pop() {
			if(IsEmp())
			{
			return 0;
			}
			else {
				
				return stack[TOP--];	
			}
	
	
}
		
		static int peek() {
			if(IsEmp())
			{
			return 0;
			}
			else {
				
				return stack[TOP] ;	
			}
	
	
}
		
		static boolean IsEmp() {
			if(TOP==-1)
				return true;
			else
				return false;
		}
		
		
		
		static boolean Isfull() {
			if(TOP==size-1)
				return true;
			else
				return false;
		}
}
