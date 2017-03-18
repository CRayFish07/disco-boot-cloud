package org.disco.boot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.meybosoft.saas.web.dao.IUserRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DSFAdsf {
	@Autowired
	private IUserRepository userRepository;

	@Test
	public void testAddStudent() {
		System.out.println(userRepository);
	}

}
