class Customer{
	int age = 20;
	String name = "Preyas";
}
public class Test {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		System.out.println("Customer name = "+customer1.name+"  Customer age = "+ customer1.age);
		System.out.println("Customer name = "+customer2.name+"  Customer age = "+ customer2.age);

	}

}
