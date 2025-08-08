package mypkg;
class StackArr{
	private int[] st;
	private int top;
	public StackArr(int x){
		st=new int[x];
		top=-1;
	}
	public boolean push(int data){
		if(top==st.length-1)return false;
		st[++top]=data;
		return true;
	}
	public int pop(){
		if(top==-1)return Integer.MIN_VALUE;
		return st[top--];
	}
	public int top(){
		if(top==-1)return Integer.MIN_VALUE;
		return st[top];
	}
}
