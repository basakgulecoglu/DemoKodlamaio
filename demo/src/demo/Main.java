package demo;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.id=1;
		product1.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)";
		product1.educatorName= "Engin Demiro�";
		
		Product product2 = new Product();
		product2.id=2;
		product2.name =("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");;
		product2.educatorName="Engin Demiro�";
		
		Product product3 = new Product(3, "Programlamaya Giri� i�in Temel Kurs", "Engin Demiro�");
		
		Product[] products = {product1,product2, product3};
		
		ProductService productService = new ProductService();
		
		
		for (Product product : products) {
			productService.jionToProgramme(product);
			System.out.println(product.name +", "+ product.educatorName );
		}
	}
}