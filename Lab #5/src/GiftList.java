
public class GiftList {
	private Node head;
	
	public GiftList() {
		head = null;
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
		
	}
	
	public boolean addGiftBasketToEnd(GiftBasket data){
		Node temp;
		temp=new Node(data);
		
			if (head == null)
			{
				head = temp;
				return true;
			}
			else
			{
				Node temp2;
				temp2 = head;
				while (temp2.getNext() != null)
				{
					temp2= temp2.getNext();
				}
				temp2.setNext(temp);
				return true;
			}
	}
	
	public void showAllGiftBasket() {
		
		Node temp;
		temp = head;
		
		while(temp.getNext()!=null) {
			temp.getData().display();
			temp= temp.getNext();
		}
	}
}

