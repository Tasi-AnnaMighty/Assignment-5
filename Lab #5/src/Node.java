
public class Node {
	private GiftBasket data;
	private Node next;
	
	public Node()
	{
		data = null;
		next = null;
	}
	
	public Node(GiftBasket data)
	{
		this.data=data;
		next=null;
	}
	
	public Node(GiftBasket Data, Node nxt) {
		data = Data;
		next = nxt;
	}

	public GiftBasket getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(GiftBasket data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
	