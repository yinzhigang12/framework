package com.ajiatech.pojo;

import java.util.Date;

public class AjiaItemParamItem {
	private long id;
	private long itemId;
	private long itemParamId;
	private String paramData;
	private Date created;
	private Date updated;
	
	public AjiaItemParamItem() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public AjiaItemParamItem(long id, long itemId, long itemParamId, String paramData, Date created, Date updated) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.itemParamId = itemParamId;
		this.paramData = paramData;
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
	 * @return itemParamId
	 */
	public long getItemParamId() {
		return itemParamId;
	}
	/**
	 * @param itemParamId 要设置的 itemParamId
	 */
	public void setItemParamId(long itemParamId) {
		this.itemParamId = itemParamId;
	}
	/**
	 * @return paramData
	 */
	public String getParamData() {
		return paramData;
	}
	/**
	 * @param paramData 要设置的 paramData
	 */
	public void setParamData(String paramData) {
		this.paramData = paramData;
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
