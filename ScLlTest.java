package mypkg;
import java.util.Scanner;
class ScLlTester{
	public static void main(String[] args){
		ScLl sl=new ScLl();
		Scanner sc=new Scanner(System.in);
		int opt,n;
		while(true){
			System.out.println("1.To Create:");
			System.out.println("2.To Traverse:");
			System.out.println("3.To AddNode:");
			System.out.println("4.To deleteNode:");
			System.out.println("5.To ReverseList:");
			System.out.println("10.To Exit:");
			System.out.print("Enter option:");
			opt=sc.nextInt();
			switch(opt){
				case 1:
					System.out.print("Enter no of node:");
					n=sc.nextInt();
					sl.createList(n);
					break;
				case 2:
					sl.traverse();
					break;
				case 3:
					sl.addNode(6,3);
					break;
				case 4:
					sl.deleteNode(3);
					break;
				case 5:
					sl.reverseList();
					break;
				case 10:
					System.exit(0);
				default:
					System.out.println("wrong option");
			}
		}
	}
}

