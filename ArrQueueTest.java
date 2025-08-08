package mypkg;
import java.util.Scanner;
class ArrQueueTest{
	public static void main(String[] args){
		ArrQueue aq=new ArrQueue(2);
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.print("Enter data:");
			boolean b=aq.enqueue(sc.nextInt());
			if(b){
				System.out.println("Enqueue success");
			}else{
				System.out.println("Can't Enqueue");
			}
		}
		int p=aq.dequeue();
		System.out.println(p);
		/*do{
			System.out.println(p);
			p=aq.dequeue();
		}while(p!=-1);*/
		//System.out.println("Queue empty");
		boolean b=aq.enqueue(40);
		if(b){
			System.out.println("Enqueue success");
		}else{
			System.out.println("Can't Enqueue");
		}
	}
}
