package circularQ;
import java.util.*;
public class circularQueue 
{
static Scanner in =new Scanner(System.in);
static int size;
static int f=-1,r=-1;
static int[] cq;

circularQueue(int n)	
{
	
	size=n;
	cq=new int[size];
}


public void enqueue(int key)
{
	if(f==0 && r==size-1)
		System.out.println("circular Queue is overflow");
	else if(f==-1 && r==-1)
	{
		f=r=0;
		cq[r]=key;
	}
	else if(r==size-1 && f!=0)
	{
		r=0;
		cq[r]=key;
	}
	else
	{
		r++;
		cq[r]=key;
	}
}

public int ele()
{
	return cq[f];
}
public int dequeue()
{
	int key;
	if(f==-1 ||r==-1)
	{
		System.out.println("circular Queue is underflow");
		return -1;
		
	}
	key=cq[f];
	if(f==r)
		f=r=-1;
	else
	{
		if(f==size-1)
			f=0;
		else
			f++;
			
	}
	return key;
}
void display()
{
	int i;  
    if(f==-1 && r==-1)  
    {  
    	System.out.println("\n Queue is empty..");  
    }  
    else  
    {  
    	if(f<r)
    		for(i=f;i<=r;i++)
    			System.out.print(" "+cq[i]);
    	else
    	{
    		for(i=f;i<size;i++)
    			System.out.print(" "+cq[i]);
    		for(i=0;i<=r;i++)
    			System.out.print(" "+cq[i]);
    	}
    }  
}
}
