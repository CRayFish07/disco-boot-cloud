package org.viewsoft.boot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.viewsoft.boot.platform.autoconfigure.ConfigProperties;

import com.viewsoft.boot.saas.user.repository.UserRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ConfigProperties configProperties;

	@Test
	public void testAddStudent() {
		for (String str : configProperties.getJpaPackageScan()) {
			System.out.println(str + "$$$$$$$$");
		}
		System.out.println(userRepository + "@@______________");
	}

}
