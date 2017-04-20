package org.viewsoft.boot.platform.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @intro
 * @version 1.0
 * @author lengyu
 * @since 2017年3月17日 上午10:32:46
 */
@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

	/**
	 * 执行原生纯SQL
	 * 
	 * @param sql
	 *            纯SQL
	 * @param x
	 *            一个泛型参数，指定返回类型
	 * @return 返回值
	 */
	<X> List<X> listBySQL(String sql, X x);

}