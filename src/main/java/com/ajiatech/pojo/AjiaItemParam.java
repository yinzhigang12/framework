package com.ajiatech.pojo;

import java.util.Date;

public class AjiaItemParam {
	private long id;
	private long itemCatId;
	private String paramData;
	private Date created;
	private Date updated;
	
	public AjiaItemParam() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public AjiaItemParam(long id, long itemCatId, String paramData, Date created, Date updated) {
		super();
		this.id = id;
		this.itemCatId = itemCatId;
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
	 * @return itemCatId
	 */
	public long getItemCatId() {
		return itemCatId;
	}
	/**
	 * @param itemCatId 要设置的 itemCatId
	 */
	public void setItemCatId(long itemCatId) {
		this.itemCatId = itemCatId;
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
