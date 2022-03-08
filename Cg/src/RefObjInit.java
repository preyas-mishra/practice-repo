class ProductInfo{
	String prodName;
	int prodId;
}


public class RefObjInit {

	public static void main(String[] args) {
		ProductInfo prodinfo1 = new ProductInfo();
		ProductInfo prodinfo2 = new ProductInfo();
		
		prodinfo1.prodName = "TV";
		prodinfo1.prodId = 101;
		
		prodinfo2.prodName = "Mobile";
		prodinfo2.prodId = 102;
		
		System.out.println("Product Name: "+prodinfo1.prodName+"  Product Id: "+prodinfo1.prodId);
		System.out.println("Product Name: "+prodinfo2.prodName+"  Product Id: "+prodinfo2.prodId);
		
	}

}
