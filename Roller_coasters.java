package circularQ;
import java.util.*;
public class Roller_coasters {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args) {
		
		int k,r,count,n,price=0,i,e,tot=0,j;
		System.out.println("enter the size of queue");
		count=in.nextInt();
		circularQueue obj=new circularQueue(count);
		System.out.println("enter the elements");
		for( i=0;i<count;i++)
		{
			n=in.nextInt();
			obj.enqueue(n);
		}		
		System.out.println("enter the value of k");
		k=in.nextInt();
		System.out.println("enter the value of r");
		r=in.nextInt();
		obj.display();
		for(i=0;i<r;i++)
		{
			tot=0;	
			for(j=0;j<count;j++)
			{
				if((tot+obj.ele())<=k)
				{
					System.out.println("total 1="+tot);
					e=obj.dequeue();
					tot=tot+e;
					System.out.println("total 2="+tot);
					obj.enqueue(e);			
					price=price+e;
					
				}	
			}	
			
			System.out.println();
		}
		obj.display();
		System.out.println(price);
		//obj.display();

	}

}
