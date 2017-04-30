package org.viewsoft.boot.platform.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @intro
 * @version 1.0
 * @author lengyu
 * @since 2017年3月19日 下午10:34:39
 */
@ConfigurationProperties(prefix = "disco")
public class PlatformConfigProperties {
	private String[] allPackageScan = {};
	private String[] jpaPackageScan = {};
	private String[] springPackageScan = {};

	public String[] getAllPackageScan() {
		return allPackageScan;
	}

	public void setAllPackageScan(String[] allPackageScan) {
		this.allPackageScan = allPackageScan;
	}

	public String[] getJpaPackageScan() {
		return jpaPackageScan;
	}

	public void setJpaPackageScan(String[] jpaPackageScan) {
		this.jpaPackageScan = jpaPackageScan;
	}

	public String[] getSpringPackageScan() {
		return springPackageScan;
	}

	public void setSpringPackageScan(String[] springPackageScan) {
		this.springPackageScan = springPackageScan;
	}

}
