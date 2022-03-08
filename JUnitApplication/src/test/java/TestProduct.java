import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Product Class")
public class TestProduct {
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("Before all test cases");
	}
	@BeforeEach
	public void setUpMultiple() {
		System.out.println("Before each test cases");
	}
	@Test
	@Order(1)
	@RepeatedTest(3)
	public void saveProduct() {
		System.out.println("Save Product method is calling");
	}
	@Test
	@Order(2)
	public void updateProduct() {
		System.out.println("Update Product method is calling");
	}
	@AfterEach
	public void clearMultiple() {
		System.out.println("After each test cases");
	}
	@AfterAll
	public static void clearOnce() {
		System.out.println("After all test cases");
	}
}
