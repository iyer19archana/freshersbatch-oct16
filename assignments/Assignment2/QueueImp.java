public class QueueImp
{
	private static final int capacity = 3;
 int arr[] = new int[capacity];
  int front = -1;
 int rear = 0;

 public void push(int pushedElement) {
  if (front < capacity - 1) {
   front++;
   arr[front] = pushedElement;
   System.out.println("Element " + pushedElement
     + " is pushed to Queue !");
   display();
  } else {
   System.out.println("Overflow !");
  }

 }

 public void pop() {
  if (front >= rear) {
   rear++;
   System.out.println("Pop operation done !");
   display();
  } else {
   System.out.println("Underflow !");
  }
 }

 public void display() {
  if (front >= rear) {
   System.out.println("Elements in Queue : ");
   for (int i = rear; i <= front; i++) {
    System.out.println(arr[i]);
   }
  }
 }

 public static void main(String[] args) {
  QueueImp queue = new QueueImp();
  queue.pop();
  queue.push(23);
  queue.push(2);
  queue.push(73);
  queue.push(21);
  queue.pop();
  queue.pop();
  queue.pop();
  queue.pop();
 }

}
