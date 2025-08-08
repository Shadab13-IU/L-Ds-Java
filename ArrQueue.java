package mypkg;
class ArrQueue{
	private int[] aq;
	private int front=-1;
	private int rear=-1;
	ArrQueue(int x){
		aq=new int[x];
	}
	public boolean enqueue(int data){
		if(rear==aq.length-1)return false;
		aq[++rear]=data;
		if(rear<1)front++;
		return true;
	}
	public int dequeue(){
		if((front==-1 && rear==-1)||front>rear){
			front=-1;
			rear=-1;
			return -1;
		}
		// If we want to shift element 
		/*int x=aq[front];
		for(int i=1; i<=rear; i++)aq[i-1]=aq[i];
		rear--;
		return x;*/
		return aq[front++];
	}
}
