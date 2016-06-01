package mypack.dlist;

public class ListNodeDL {
	private int key;
	private ListNodeDL prev;
	private ListNodeDL next;

	public ListNodeDL(int key, ListNodeDL prev, ListNodeDL next) {
		this.key = key;
		this.prev = prev;
		this.next = next;
	}

	public ListNodeDL() {
		this(0, null, null);
	}
	
	int getKey() {
		return key;
	}
	
	void setKey(int key){
		this.key = key;
	}
	
	ListNodeDL getPrev() {
		return prev;
	}
	
	void setPrev(ListNodeDL prev){
		this.prev = prev;
	}
	
	ListNodeDL getNext(){
		return next;
	}
	
	void setNext(ListNodeDL next){
		this.next = next;
	}

}
