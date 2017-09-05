package com.ajiatech.pojo;

import java.util.Date;

public class AjiaItemDesc {
	private long itemId;
	private String itemDesc;
	private Date created;
	private Date updated;
	
	public AjiaItemDesc() {
		super();
		// TODO �Զ����ɵĹ��캯�����
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
	 * @param itemId Ҫ���õ� itemId
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
	 * @param itemDesc Ҫ���õ� itemDesc
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
