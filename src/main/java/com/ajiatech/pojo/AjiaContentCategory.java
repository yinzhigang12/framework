package com.ajiatech.pojo;

import java.util.Date;

public class AjiaContentCategory {
	private long id;
	private long parentId;
	private String name;
	private int status;
	private int sortOrder;
	private int isParent;
	private Date created;
	private Date updated;
	
	public AjiaContentCategory() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public AjiaContentCategory(long id, long parentId, String name, int status, int sortOrder, int isParent,
			Date created, Date updated) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.status = status;
		this.sortOrder = sortOrder;
		this.isParent = isParent;
		this.created = created;
		this.updated = updated;
	}
	/**
	 * @return id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return parentId
	 */
	public long getParentId() {
		return parentId;
	}
	/**
	 * @param parentId 要设置的 parentId
	 */
	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status 要设置的 status
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	/**
	 * @return sortOrder
	 */
	public int getSortOrder() {
		return sortOrder;
	}
	/**
	 * @param sortOrder 要设置的 sortOrder
	 */
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	/**
	 * @return isParent
	 */
	public int getIsParent() {
		return isParent;
	}
	/**
	 * @param isParent 要设置的 isParent
	 */
	public void setIsParent(int isParent) {
		this.isParent = isParent;
	}
	/**
	 * @return created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * @param created 要设置的 created
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/**
	 * @return updated
	 */
	public Date getUpdated() {
		return updated;
	}
	/**
	 * @param updated 要设置的 updated
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	

}
