package com.viewsoft.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.viewsoft.boot.platform.base.AbstractApplication;
import org.viewsoft.boot.platform.config.ConfigProperties;

/**
 * @author admin org.viewsoft.boot.* (平台层) com.viewsoft.boot.* (项目层)
 * @intro spring boot的main方法需要放在程序的根目录 如果放到子目录 就会无法扫描到其他的包
 */
@SpringBootApplication
// 开户事务支持
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@EnableConfigurationProperties(ConfigProperties.class)
public class Application extends AbstractApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		app.run(args);
	}
}
