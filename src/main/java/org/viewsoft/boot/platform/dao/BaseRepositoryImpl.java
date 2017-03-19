package org.viewsoft.boot.platform.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * @intro 
 * @version 1.0
 * @author lengyu
 * @since 2017年3月17日 上午10:47:51
 */
public class BaseRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
		implements BaseRepository<T, ID> {

	private final EntityManager entityManager;

	// 父类没有不带参数的构造方法，这里手动构造父类
	public BaseRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		this.entityManager = entityManager;
	}

	// 通过EntityManager来完成查询
	@Override
	@SuppressWarnings("unchecked")
	public <X extends Object> List<X> listBySQL(String sql, X x) {
		List<X> list = new ArrayList<X>();
		list.addAll(entityManager.createNativeQuery(sql).getResultList());
		return list;
	}

}
