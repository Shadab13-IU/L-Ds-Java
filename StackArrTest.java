package mypkg;
import java.util.Scanner;
class StackArrTest{
	public static void main(String[] args){
		StackArr st=new StackArr(9);
		boolean b;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<10; i++){
			System.out.print("Enter data to push:");
			b=st.push(sc.nextInt());
			if(b==true){
				System.out.println("Succesfully pushed");
			}else{
				System.out.println("Stack Full");
				break;
			}
		}
		int p=st.pop();
		System.out.println(p);
		while(p!=Integer.MIN_VALUE){
			p=st.pop();
			if(p==Integer.MIN_VALUE)break;
			System.out.println(p);
		}
		System.out.println("Stack is Empty");
		int t=st.top();
		System.out.println(t);
	}
}
