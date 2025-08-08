package mypkg;
import java.util.Scanner;
class ScLl{
	private class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
			next=this;
		}
	}
	public static Node head;
	Scanner sc;
	ScLl(){
		head=null;
		sc=new Scanner(System.in);
	}
	public void createList(int n){
		Node temp=null;
		Node t=null;
		for(int i=1; i<=n; i++){
			System.out.print("Enter data:");
			temp=new Node(sc.nextInt());
			if(i==1){
				head=temp;
			}
			else{
				t=head;
				while(t.next!=head)t=t.next;
				t.next=temp;
				temp.next=head;
			}
		}
	}
	public void addNode(int data,int pos){
			Node temp=new Node(data);
			Node t;
			int count=1;
			if(pos==1){
				temp.next=head;
				head=temp;
			}
			else{
				t=head;
				while(t.next!=head && count<pos-1){
					count++;
					t=t.next;
				}
				temp.next=t.next;
				t.next=temp;
			}
	}
	public void deleteNode(int pos){
			Node t,p;
			int p1=1;
			t=head;
			p=head;
			if(head==null)System.out.println("List is empty");
			if(pos==1){
				head=t.next;
				t.next=null;
			}else{
				while(t.next!=head && p1<pos){
					p=t;
					t=t.next;
					p1++;
				}
				p.next=t.next;
				t.next=null;
			}
	}
	public void reverseList(){
			Node p,q,r;
			p=head;
			q=p.next;
			r=q.next;
			while(r!=head){
				q.next=p;
				p=q;
				q=r;
				r=r.next;
			}
			q.next=p;
			head.next=q;
			head=q;
	}
	public void traverse(){
		Node t=head;
		if(t!=null){
			do{
				System.out.print(t.data+" ");
				t=t.next;
			}while(t!=head);
			System.out.println();
		}else{
			System.out.println("List is empty");
		}
		/*while(t.next!=head){
			System.out.print(t.data+" ");
			t=t.next;
		}
		System.out.print(t.data+" ");
		t=t.next;
		System.out.println(t.data);*/
	}
}
