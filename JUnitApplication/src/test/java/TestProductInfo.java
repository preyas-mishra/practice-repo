import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProductInfo {
	private ProductInfo prodinfo;
	private String actual;
	private String expected;
	@BeforeEach
	public void setUp() {
		expected = "Product Name is : LG Monitor";
		actual = "";
		prodinfo = new ProductInfo();
	}
	
	
	@Test
	void testgetProductName() {
		actual = prodinfo.getProductName("LG Monitor");
		assertEquals(expected, actual);

	}
	@AfterEach
	public void clean() {
		prodinfo = null;
		expected = "";
		actual = "";
	}
}
