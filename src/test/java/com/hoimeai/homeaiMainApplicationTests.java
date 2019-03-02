package com.hoimeai;

import com.homeai.entity.User;
import com.homeai.mq.producer.RegisterInfoSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=com.homeai.HomeaiMainApplication.class)
public class homeaiMainApplicationTests {

	@Autowired
	private RegisterInfoSender registerInfoSender;

	@Test
	public void hello() throws Exception {
		registerInfoSender.send(new User());
	}

}
