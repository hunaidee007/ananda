package com.ananda.springcore;

import com.ananda.springcore.component.Duck;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringCoreApplicationTests {

	@Autowired
	Duck duck;

	@Test
	void contextLoads() {
		duck.fly();
	}

}
