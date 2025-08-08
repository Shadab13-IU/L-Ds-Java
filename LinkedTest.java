package mypkg;
import java.util.Scanner;
class LinkedTest{
	public static void main(String[] args){
		SinglyList sl=new SinglyList();
		int choice;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1.To Create List:");
			System.out.println("2.To Add Node:");
			System.out.println("3.To Traverse List:");
			System.out.println("4.To Delete Node:");
			System.out.println("5.To Reverse Node:");
			System.out.println("6.Exit:");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			switch(choice){
				case 1:
					sl.createList(5);
					break;
				case 2:
					sl.addNode(32,7);
					break;
				case 3:
					sl.traverse();
					break;
				case 4:
					sl.deleteNode(1);
					break;
				case 5:
					sl.reverseList();
					break;
				case 6:
					return;
				default:
					System.out.println("Enter Correct option");
			}
		}
	}
}
