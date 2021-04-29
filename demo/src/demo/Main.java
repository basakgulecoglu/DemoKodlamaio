package demo;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.id=1;
		product1.name="Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		product1.educatorName= "Engin Demiroð";
		
		Product product2 = new Product();
		product2.id=2;
		product2.name =("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");;
		product2.educatorName="Engin Demiroð";
		
		Product product3 = new Product(3, "Programlamaya Giriþ için Temel Kurs", "Engin Demiroð");
		
		Product[] products = {product1,product2, product3};
		
		ProductService productService = new ProductService();
		
		
		for (Product product : products) {
			productService.jionToProgramme(product);
			System.out.println(product.name +", "+ product.educatorName );
		}
	}
}