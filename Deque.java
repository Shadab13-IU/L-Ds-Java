package mypkg;
class Deque{
	private int[] a;
	private int front;
	private int rear;
	private int frontp;
	private int rearp;
	Deque(int x){
		a=new int[x];
		front=-1;
		rear=-1;
		frontp=x;
		rearp=x;
	}
	public boolean enqueue(int data){
		if(rear==a.length-1)return false;
		a[++rear]=data;
		if(front==-1 && rear==0)front++;
		return true;
	}
	public int deqeue(){
		if(front>rear){
			front=-1;
			rear=-1;
			return -1;
		}
		return a[front++];
	}
	public int push(int y){
		if(rearp-rear==1)return -1;
		a[--rearp]=y;
		if(rearp==a.length-1 && frontp==a.length)frontp--;
		return 1;
	}
	public int pop(){
		if(frontp<rearp){
			 frontp=a.length;
			 rearp=a.length;
			 return -1;
		}
		return a[frontp--];
	}
	public void traverse(){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
