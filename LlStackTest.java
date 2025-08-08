package mypkg;
import java.util.Scanner;
class LlStackTest{
	public static void main(String[] args){
		LlStack ls=new LlStack();
		boolean b=ls.push(10);
		if(b){
			System.out.println("Success");
		}else{
			System.out.println("Stack full");
		}
		int p=ls.pop();
		if(p!=-1){
			System.out.println(p);
		}else{
			System.out.println("Stack underflow");
		}
	}
}
