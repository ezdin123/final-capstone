package yenatLounge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YenatLoungeApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void test1() {
		String expectedTitle = "selenium documentations - Google Search";
		String actualTitle = "selenium documentations - Google Search";

		Assertions.assertEquals(expectedTitle, actualTitle);
		
	//	System.out.println("testedPassed");
	}

}
