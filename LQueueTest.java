package mypkg;
class LQueueTest{
	public static void main(String[] args){
		LQueue lq=new LQueue();
		boolean b=lq.enqueue(5);
		if(b==true){
			System.out.println("Success");
		}else{
			System.out.println("Memory full");
		}
		boolean c=lq.enqueue(5);
		if(c==true){
			System.out.println("Success");
		}else{
			System.out.println("Memory full");
		}
		int d=lq.dequeue();
		if(d!=-1){
			System.out.println(d);
		}else{
			System.out.println("Queue is empty");
		}
		int e=lq.dequeue();
		if(e!=-1){
			System.out.println(e);
		}else{
			System.out.println("Queue is empty");
		}
		int f=lq.dequeue();
		if(f!=-1){
			System.out.println(e);
		}else{
			System.out.println("Queue is empty");
		}
	}
}
