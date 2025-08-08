package mypkg;
class LlStack{
	private class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	private Node top;
	LlStack(){
		top=null;
	}
	public boolean push(int x){
		Node temp=new Node(x);
		if(temp==null)return false;
		temp.next=top;
		top=temp;
		return true;
	}
	public int pop(){
		if(top==null)return -1;
		Node temp=top;
		top=top.next;
		temp.next=null;
		return temp.data;
	}
}
