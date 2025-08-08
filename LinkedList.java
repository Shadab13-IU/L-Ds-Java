package mypkg;
import java.util.Scanner;
class SinglyList{
	private class Node{
		int data;
		Node next;
		Node(int x){
			data=x;
		}
	}
	static Node head;
	Scanner sc;
	public SinglyList(){
		head=null;
		sc=new Scanner(System.in);
	}
	public void createList(int no){
		Node temp=null;
		Node t=null;
		for(int i=1; i<=no; i++){
			System.out.print("Enter data:");
			temp=new Node(sc.nextInt());
			if(i==1){
				head=temp;
			}else{
				t=head;
				while(t.next!=null)t=t.next;
				t.next=temp;
			}
		}
	}
	void addNode(int data,int pos){
		int p=1;
		Node temp=new Node(data);
		int count=0;
		Node t=head;
		while(t!=null){
			count++;
			t=t.next;
		}
		if(pos>count){
			System.out.println("Pos not found");
		}else if(pos==1){
			temp.next=head;
			head=temp;
		}else{
			t=head;
			while(t.next!=null && p<pos-1){
				t=t.next;
				p++;
			}
			temp.next=t.next;
			t.next=temp;
		}
	}
	public void deleteNode(int pos){
		Node temp=head;
		if(pos==1){
			head=head.next;
			temp.next=null;
		}else{
			int i=1;
			Node temp2=head;
			while(temp!=null && i<pos){
				temp2=temp;
				temp=temp.next;
				i++;
			}
			temp2.next=temp.next;
			temp.next=null;
		}
	}
	public void reverseList(){
			Node p=head;
			Node q=p.next;
			Node r=q.next;
			while(r!=null){
				q.next=p;
				//r.next=q;
				p=q;
				q=r;
				r=r.next;
			}
			q.next=p;
			head.next=r;
			head=q;
	}
	public void traverse(){
		if(head==null){
			System.out.println("List is empty");
		}else{
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
		 		temp=temp.next;
			}
		}
		System.out.println();
	}
}
