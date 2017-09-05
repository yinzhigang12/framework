package com.ajiatech.pojo;

import java.util.Date;

public class AjiaItemDesc {
	private long itemId;
	private String itemDesc;
	private Date created;
	private Date updated;
	
	public AjiaItemDesc() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public AjiaItemDesc(long itemId, String itemDesc, Date created, Date updated) {
		super();
		this.itemId = itemId;
		this.itemDesc = itemDesc;
		this.created = created;
		this.updated = updated;
	}
	/**
	 * @return itemId
	 */
	public long getItemId() {
		return itemId;
	}
	/**
	 * @param itemId 要设置的 itemId
	 */
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return itemDesc
	 */
	public String getItemDesc() {
		return itemDesc;
	}
	/**
	 * @param itemDesc 要设置的 itemDesc
	 */
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
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
