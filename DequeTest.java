package mypkg;
import java.util.Scanner;
class DequeTest{
	public static void main(String[] args){
		Deque dq=new Deque(4);
		Scanner sc=new Scanner(System.in);
		int x,y,z;
		boolean b;
		while(true){
			System.out.println("1.Enqueue:");
			System.out.println("2.Dequeue:");
			System.out.println("3.Push:");
			System.out.println("4.Pop:");
			System.out.println("5.Exit:");
			System.out.print("Enter option:");
			switch(sc.nextInt()){
				case 1:
					System.out.print("Enter the data:");
					b=dq.enqueue(sc.nextInt());
					if(b==false)System.out.println("Can't queue more");
					break;
				case 2:
					x=dq.deqeue();
					if(x==-1)System.out.println("Queue has been emptied");
					break;
				case 3:
					System.out.print("Enter the data:");
					y=dq.push(sc.nextInt());
					if(y==-1)System.out.println("Queue has been full");
					break;
				case 4:
					z=dq.pop();
					if(z==-1)System.out.println("Queue has been emptied through pop");
					break;
				case 5:
					return;
				default:
					System.out.println("Enter correct option");
			}
		}

	}
}
