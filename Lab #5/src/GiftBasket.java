public class GiftBasket {
	private int id;
	private String type;
	private float cost;
	
	//Default Constructor
	public GiftBasket()
	{
		id = 0;
		type = "";
		cost = 0;
	}
	
	//Primary Constructor
	public GiftBasket(int ID, String Type, float Cost)
	{
		id = ID;
		type = Type;
		cost = Cost;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public float getCost() {
		return cost;
	}

	public void setId(int ID) {
		id = ID;
	}

	public void setType(String Type) {
		type = Type;
	}

	public void setCost(float Cost) {
		cost = Cost;
	}
	
	public void display(){
		System.out.println(id + type + cost);
	}
}	
	
	
	
	