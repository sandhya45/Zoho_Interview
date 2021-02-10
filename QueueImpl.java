import java.util.*;
public class QueueImpl {
  int size ;
  int items[] ;
  int front, rear;
  
  QueueImpl(int a) {
   size=a;
    front = -1;
    rear = -1;
    items= new int[size];
  }

  // check if the queue is full
  boolean isFull() {
    if (front == 0 && rear == size - 1) {
      return true;
    }
    return false;
  }

  // check if the queue is empty
  boolean isEmpty() {
    if (front == -1)
      return true;
    else
      return false;
  }

  // insert elements to the queue
  void enQueue(int element) {

    // if queue is full
    if (isFull()) {
      System.out.println("Queue is full");
    }
    else {
      if (front == -1) {
        // mark front denote first element of queue
        front = 0;
      }

      rear=rear+1;
      
      items[rear] = element;
      System.out.println("Insert " + element);
    }
  }

  // delete element from the queue
  int deQueue() {
    int element;

    // if queue is empty
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return (-1);
    }
    else {
      // remove element from the front of queue
      element = items[front];

      // if the queue has only one element
      if (front >= rear) {
        front = -1;
        rear = -1;
      }
      else {
        // mark next element as the front
        front++;
      }
      System.out.println( element + " Deleted");
      return (element);
    }
  }

  // display element of the queue
  void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    }
    else {
      // display the front of the queue
      System.out.println("\nFront index-> " + front);

      // display element of the queue
      System.out.println("Items -> ");
      for (i = front; i <= rear; i++)
        System.out.print(items[i] + "  ");

      // display the rear of the queue
      System.out.println("\nRear index-> " + rear);
    }
  }

  public static void main(String[] args) {
	  	Scanner S =new Scanner(System.in);
	  System.out.print("enter the size of Queue");
	  	int s=S.nextInt();
	 QueueImpl q = new QueueImpl(s);

   
    // insert elements to the queue
    
      q.enQueue(1);
      q.enQueue(1);
      q.enQueue(1);      
      //q.display(); 
    // deQueue removes element entered first i.e. 1
    q.deQueue();

    q.display();

  }
}
