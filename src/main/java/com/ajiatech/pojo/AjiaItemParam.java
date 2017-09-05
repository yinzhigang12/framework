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
		// TODO �Զ����ɵĹ��캯�����
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
	 * @param id Ҫ���õ� id
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
	 * @param itemCatId Ҫ���õ� itemCatId
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
	 * @param paramData Ҫ���õ� paramData
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
