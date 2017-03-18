package cn.org.disco.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import cn.org.disco.boot.platform.dao.BaseRepositoryFactoryBean;

/**
 * @author admin
 * @intro spring boot的main方法需要放在程序的根目录 如果放到子目录 就会无法扫描到其他的包
 */
@EnableScheduling
@SpringBootApplication(scanBasePackages = { "com.meybosoft" })
@EnableJpaRepositories(basePackages = { "cn.org.disco.boot",
		"${disco.dao.packages}" }, repositoryFactoryBeanClass = BaseRepositoryFactoryBean.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}
}
