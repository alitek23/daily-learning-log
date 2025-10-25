package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		// set value
		product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "kahve.jpg";

		// get
		// System.out.println(product1.name);

		Product product2 = new Product();
		
		product2.name = "bosch Kahve Makinesi";
		product2.unitPrice = 7000;
		product2.discount = 8;
		product2.unitsInStock = 6;
		product2.imageUrl = "kahven.jpg";

		Product product3 = new Product();
		
		product3.name = "lg Kahve Makinesi";
		product3.unitPrice = 7800;
		product3.discount = 9;
		product3.unitsInStock = 7;
		product3.imageUrl = "kahvem.jpg";
		
		Product[] products= {product1,product2,product3};
	}

}
