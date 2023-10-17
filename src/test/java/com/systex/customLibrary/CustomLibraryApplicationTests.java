package com.systex.customLibrary;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CustomLibraryApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(5, MathUtils.add(2, 3));
		assertEquals(-1, MathUtils.add(2, -3));
		assertEquals(0, MathUtils.add(0, 0));
		assertEquals(1, MathUtils.minus(2, 1));
		assertEquals(2, MathUtils.multi(2, 1));
		assertEquals(2, MathUtils.div(2, 1));
		System.out.println(MathUtils.generateCaptcha());
	}
}
