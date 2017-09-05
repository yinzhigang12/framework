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
		// TODO �Զ����ɵĹ��캯�����
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
	 * @param id Ҫ���õ� id
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
	 * @param parentId Ҫ���õ� parentId
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
	 * @param name Ҫ���õ� name
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
	 * @param status Ҫ���õ� status
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
	 * @param sortOrder Ҫ���õ� sortOrder
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
	 * @param isParent Ҫ���õ� isParent
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
	 * @param created Ҫ���õ� created
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
	 * @param updated Ҫ���õ� updated
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	

}
