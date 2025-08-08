package mypkg;
class DllTest{
	public static void main(String[] args){
		DlL dl =new DlL();
		dl.createList(5);
		dl.traverse();
		//dl.addNode(6);
		dl.deleteNode(5);
		dl.traverse();

	}
}
