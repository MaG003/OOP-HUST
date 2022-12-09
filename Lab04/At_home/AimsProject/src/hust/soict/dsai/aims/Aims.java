package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
        public static void main(String[] args) {
		
		// create a new cart
		Cart anOrder = new Cart();

		// Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geoge Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 23.65f);
		anOrder.addDigitalVideoDisc(dvd3);

		// In ra total cost
		System.out.print("Total cost is: ");
		System.out.println(anOrder.totalCost());
		// In ra quantity
		System.out.print("Dvd quantity in cart: ");
		System.out.println(anOrder.qtyOrdered);
		// In ra danh sách giỏ hàng
		anOrder.print();
        }
}
