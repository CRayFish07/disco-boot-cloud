package org.viewsoft.boot.platform.bean;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * 在数据库存储和使用过程中，统一采用ID的访问形式 .<br />
 * 在数据库当中启用自动时间戳的方式，对该调记录的更新时间进行存储
 */
@MappedSuperclass
public abstract class IdEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// 声明两个时间列，用来作为创建时间和更新时间
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	// 在创建时，对创建时间和更新时间进行刷新
	@PrePersist
	public void prePersist() {
		this.updateTime = new Date();
		this.createTime = this.updateTime;
	}

	// 在更新时，对更新时间进行刷新
	@PreUpdate
	public void preUpdate() {
		this.updateTime = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}