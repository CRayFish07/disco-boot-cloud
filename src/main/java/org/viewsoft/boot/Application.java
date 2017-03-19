package org.viewsoft.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.viewsoft.boot.platform.autoconfigure.ConfigProperties;
import org.viewsoft.boot.platform.repository.BaseRepositoryFactoryBean;

/**
 * @author admin
 * @intro spring boot的main方法需要放在程序的根目录 如果放到子目录 就会无法扫描到其他的包
 */
@SpringBootApplication
@EnableConfigurationProperties(ConfigProperties.class)
// 扫描Spring注解
@ComponentScan(basePackages = { "org.viewsoft.boot.*", "com.viewsoft.boot.*" })
// 扫描实体注解
@EntityScan(basePackages = { "com.viewsoft.boot.*", "org.viewsoft.boot.*" })
// 扫描Dao注解
@EnableJpaRepositories(basePackages = { "org.viewsoft.boot.*",
		"com.viewsoft.boot.*" }, repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}
}
