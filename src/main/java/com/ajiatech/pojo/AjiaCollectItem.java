package com.ajiatech.pojo;

import java.util.Date;

public class AjiaCollectItem {
	private long id;
	private long userId;
	private long itemId;
	private String title;
	private Double price;
	private String picPath;
	private String itemParamData;
	private int status;
	private Date created;
	private Date updated;
	
	public AjiaCollectItem() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public AjiaCollectItem(long id, long userId, long itemId, String title, Double price, String picPath,
			String itemParamData, int status, Date created, Date updated) {
		super();
		this.id = id;
		this.userId = userId;
		this.itemId = itemId;
		this.title = title;
		this.price = price;
		this.picPath = picPath;
		this.itemParamData = itemParamData;
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
	 * @param id 要设置的 id
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
	 * @param userId 要设置的 userId
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
	 * @param itemId 要设置的 itemId
	 */
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title 要设置的 title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price 要设置的 price
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return picPath
	 */
	public String getPicPath() {
		return picPath;
	}
	/**
	 * @param picPath 要设置的 picPath
	 */
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	/**
	 * @return itemParamData
	 */
	public String getItemParamData() {
		return itemParamData;
	}
	/**
	 * @param itemParamData 要设置的 itemParamData
	 */
	public void setItemParamData(String itemParamData) {
		this.itemParamData = itemParamData;
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
	};

}
