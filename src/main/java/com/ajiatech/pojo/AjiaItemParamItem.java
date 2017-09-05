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
		// TODO �Զ����ɵĹ��캯�����
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
	 * @param id Ҫ���õ� id
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
	 * @param itemId Ҫ���õ� itemId
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
	 * @param itemParamId Ҫ���õ� itemParamId
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
