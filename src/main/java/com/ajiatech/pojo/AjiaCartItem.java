package com.ajiatech.pojo;

import java.util.Date;

public class AjiaCartItem {
	private long id;
	private long userId;
	private long itemId;
	private int num;
	private int status;
	private Date created;
	private Date updated;
	
	public AjiaCartItem() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public AjiaCartItem(long id, long userId, long itemId, int num, int status, Date created, Date updated) {
		super();
		this.id = id;
		this.userId = userId;
		this.itemId = itemId;
		this.num = num;
		this.status = status;
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
	 * @return userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId Ҫ���õ� userId
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * @return itemId
	 */
	public long getItemId() {
		return itemId;
	}
	/**
	 * @param itemId Ҫ���õ� itemId
	 */
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num Ҫ���õ� num
	 */
	public void setNum(int num) {
		this.num = num;
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
