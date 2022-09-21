package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "";

		Product product1 = new Product();
		// set value
		/*product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "bilmemne.jpg";
		
		
		// 10-14 satırlarını yapınca product'e oradaki verileri tutarız
		*/
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
			
		
		// System.out.println(product1.name);

		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");
		

		Product product3 = new Product();
		
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		
		for (Product product : products) { //for yazdıktan sonra ctrl+space yapıp foreach kısmına tıkla. Bunun sonucunda Product dizisinin tüm terimlerini otomatik olarak döner.
			System.out.println("<li>" + product.getName() + "</li>");
		}
		
		System.out.println("</ul>"); //bu </ul> falan html ile ilgili. Konumuzla pek ilgisi yok
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05325654654654");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Hüseyin");
		individualCustomer.setLastName("Yaşar");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Yaşar Software");
		corporateCustomer.setPhone("05389768125");
		corporateCustomer.setTaxNumber("111113131");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};

	}

}
