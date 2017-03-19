package org.viewsoft.boot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.viewsoft.boot.saas.user.dao.UserRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void testAddStudent() {
		System.out.println(userRepository + "@@______________");
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
