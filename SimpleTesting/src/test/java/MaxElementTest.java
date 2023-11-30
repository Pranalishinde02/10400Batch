import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MaxElementTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Testing");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Tesing");
	}

	@Test
	public void test() {

		assertEquals(4, MaxElement.maxArray(new int []{1,2,3,4}));
		
	}

}
