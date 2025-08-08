package mypkg;
import java.util.Scanner;
class DcLl{
	class Node{
		Node prev=this;
		int data;
		Node next=this;
		Node(int x){
			data=x;
		}
	}
	static Node head;
	Scanner sc;
	DcLl(){
		head=null;
		sc=new Scanner(System.in);
	}
	void createList(int n){
		if(n<1){
			System.out.println("Pass No greater than zero");
		}
		else{
			Node temp;
			Node t;
			for(int i=1; i<=n; i++){
				System.out.print("Enter data:");
				temp=new Node(sc.nextInt());
				if(i==1){
					head=temp;
				}else{
					t=head;
					while(t.next!=head)t=t.next;
					t.next=temp;
					temp.prev=t;
					head.prev=temp;
					temp.next=head;
				}
			}
		}
	}
	void addNode(int data,int pos){
			Node temp,t;
			temp=new Node(data);
			int p=1;
			if(pos==1){
				temp.next=head;
				head.prev.next=temp;
				temp.prev=head.prev;
				head.prev=temp;
				head=temp;
			}else{
				t=head;
				while(t.next!=head && p<pos-1){
					t=t.next;
					p++;
				}
				temp.next=t.next;
				t.next.prev=temp;
				temp.prev=t;
				t.next=temp;
			}
	}
	void deleteNode(int pos){
			Node t,p;
			p=head;
			int post=1;
			if(pos==1){
				head.next.prev=head.prev;
				head.prev.next=head.next;
				head.prev=null;
				head=head.next;
				p.next=null;
			}else{
				t=head;
				while(t.next!=head && post<pos){
					p=t;
					t=t.next;
					post++;
				}
				p.next=t.next;
				t.prev=null;
				t.next.prev=p;
				t.next=null;
			}
	}
	void traverse(){
			Node t=head;
			Node p;
			while(t.next!=head){
				System.out.print(t.data+" ");
				t=t.next;
			}
			System.out.print(t.data+" ");
			System.out.print(t.next.data+" ");
			while(t!=head){
				System.out.print(t.data+" ");
				t=t.prev;
			}
			System.out.print(t.data+" ");
			System.out.println(t.prev.data+" ");
	}
}
