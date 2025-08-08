package mypkg;
import java.util.Scanner;
class LQueue{
	private class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	private Node front;
	private Node rear;
	Scanner sc;
	LQueue(){
		front=null;
		rear=null;
		sc=new Scanner(System.in);
	}
	public boolean enqueue(int data){
		Node temp=new Node(data);
		if(temp==null)return false;
		if(front==null && rear==null){
			front=temp;
			rear=temp;
			return true;
		}
		rear.next=temp;
		rear=temp;
		return true;
	}
	public int dequeue(){
		if(front==null)return -1;
		Node temp=front;
		front=front.next;
		temp.next=null;
		if(front==null)rear=null;
		return temp.data;
	}
}
