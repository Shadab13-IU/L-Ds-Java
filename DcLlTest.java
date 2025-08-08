package mypkg;
class DcLlTest{
	public static void main(String[] args){
		DcLl dc=new DcLl();
		dc.createList(5);
		dc.traverse();
		//dc.addNode(10,6);
		//dc.traverse();
		dc.deleteNode(5);
		dc.traverse();
	}
}
