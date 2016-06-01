package mypack.list;

public class ListNodeSL {
	
	private int key;
	
	private ListNodeSL next;

	public ListNodeSL(int key, ListNodeSL next) {
		this.key = key;
		this.next = next;
	}
	
	public ListNodeSL(){
		this(0, null);
	}
	
	ListNodeSL getNext(){
		return next;
	}
	
	void setNext(ListNodeSL next){
		this.next = next;
	}
	
	int getKey(){
		return key;
	}
	
	void setKey(int key){
		this.key = key;
	}

}
