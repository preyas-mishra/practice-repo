class Product{
	int productId;
	String productName;
	
	void saveProdInfo(int prodId,String prodName) {
		productId = prodId;
		productName = prodName;
	}
	void display() {
		System.out.println("Product Name: "+productName+" ProductId: "+productId);
	}
}
public class MethodObjInit {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.saveProdInfo(101, "Mobile");
		p1.display();
	}

}
