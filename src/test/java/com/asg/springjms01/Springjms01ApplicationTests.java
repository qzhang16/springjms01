package com.asg.springjms01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springjms01ApplicationTests {

	@Autowired
	MsgSender msgSender;

	@Test
	void testSend() {
		msgSender.sendMsg("hello from spring jms 03.");
	}

}
