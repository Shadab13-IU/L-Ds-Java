package mypkg;
import java.util.Scanner;
class DlL{
	class Node{
		Node prev;
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	static Node head;
	Scanner sc;
	DlL(){
		sc=new Scanner(System.in);
		head=null;
	}
	void createList(int n){
		Node temp;
		Node t;
		for(int i=1; i<=n; i++){
			System.out.print("Enter data:");
			temp=new Node(sc.nextInt());
			if(i==1){
				head=temp;
			}else{
				t=head;
				while(t.next!=null)t=t.next;
				t.next=temp;
				temp.prev=t;
			}
		}
	}
	void deleteNode(int pos){
		Node t=head,p=head,q=head;
		if(pos==1){
			p=p.next;
			p.prev=null;
			head.next=null;
			head=p;
		}else{
			int p1=1;
			//q=q.next;
			while(t.next!=null && p1<pos){
				p=t;
				t=t.next;
				p1++;
			}
			p.next=t.next;
			if(t.next!=null)t.next.prev=p;
			t.next=null;
			t.prev=null;
		}
	}
	void addNode(int pos){
		Node temp;
		Node t;
		int p;
		System.out.print("Enter data:");
		temp=new Node(sc.nextInt());
		if(pos==1){
			temp.next=head;
			head.prev=temp;
			head=temp;
		}else{
			t=head;
			p=1;
			while(t.next!=null && p<pos-1){
				t=t.next;
				p++;
			}
			temp.next=t.next;
			if(t.next!=null)t.next.prev=temp;
			t.next=temp;
			temp.prev=t;
		}

	}
	void traverse(){
		Node t=head;
		while(t.next!=null){
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.print(t.data+" ");
		while(t!=null){
			System.out.print(t.data+" ");
			t=t.prev;
		}
		System.out.println();
	}
}
