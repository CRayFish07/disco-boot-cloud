package com.viewsoft.boot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.viewsoft.boot.platform.config.PlatformConfigProperties;
import org.viewsoft.boot.platform.log.LogUtils;

import com.viewsoft.boot.saas.user.domain.User;
import com.viewsoft.boot.saas.user.service.IUserService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
	@Autowired
	private IUserService<User, Long> userService;
	@Autowired
	private PlatformConfigProperties configProperties;

	@Test
	public void testAddStudent() {
		for (String str : configProperties.getJpaPackageScan()) {
			System.out.println(str + "$$$$$$$$");
		}

		User entity = new User();
		entity.setName("1111111111");
		entity.setAge(33);
		userService.addEntity(entity);
		LogUtils.debug("这是写的日志");
		LogUtils.error("set cache error", null);
		System.out.println("新增实体的ID：" + entity.getId());
	}
}
