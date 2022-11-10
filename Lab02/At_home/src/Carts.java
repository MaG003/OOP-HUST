import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private float totalcost = 0;
	ArrayList<DigitalVideoDisc> itemsOderedList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);
	public int qtyOrdered = 0;
	
	// Delete
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOderedList.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
		qtyOrdered = itemsOderedList.size();
	}
	
	// Add 
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		// If the quantity is not max
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOderedList.add(disc);
			System.out.println("The disc " + disc.getTitle() + " has been added");
			qtyOrdered = itemsOderedList.size();
		}
		// If the quantity is max
		else System.out.println("The cart is almost full");
	}
	
	//Total Money
	public float totalCost() {
		for(int i = 0; i < itemsOderedList.size(); i++) {
			totalcost += itemsOderedList.get(i).getCost();
		}
		return totalcost;
	}
}
