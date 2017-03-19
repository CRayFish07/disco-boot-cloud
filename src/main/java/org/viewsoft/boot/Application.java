package org.viewsoft.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.viewsoft.boot.platform.dao.BaseRepositoryFactoryBean;

/**
 * @author admin
 * @intro spring boot的main方法需要放在程序的根目录 如果放到子目录 就会无法扫描到其他的包
 */
@EnableScheduling
@SpringBootApplication(scanBasePackages = { "com.viewsoft", "org.viewsoft" })
@EnableJpaRepositories(basePackages = { "com.viewsoft",
		"org.viewsoft" }, repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}
}
