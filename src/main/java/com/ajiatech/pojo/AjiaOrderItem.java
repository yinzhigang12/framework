package com.ajiatech.pojo;

public class AjiaOrderItem {
	private String id;
	private String itemId;
	private String orderId;
	private Integer num;
	private String title;
	private long price;
	private long totalFee;
	private String picPath;
	
	public AjiaOrderItem() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public AjiaOrderItem(String id, String itemId, String orderId, Integer num, String title, long price, long totalFee,
			String picPath) {
		super();
		this.id = id;
		this.itemId = itemId;
		this.orderId = orderId;
		this.num = num;
		this.title = title;
		this.price = price;
		this.totalFee = totalFee;
		this.picPath = picPath;
	}
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return itemId
	 */
	public String getItemId() {
		return itemId;
	}
	/**
	 * @param itemId Ҫ���õ� itemId
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId Ҫ���õ� orderId
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return num
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * @param num Ҫ���õ� num
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * @return title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title Ҫ���õ� title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return price
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * @param price Ҫ���õ� price
	 */
	public void setPrice(long price) {
		this.price = price;
	}
	/**
	 * @return totalFee
	 */
	public long getTotalFee() {
		return totalFee;
	}
	/**
	 * @param totalFee Ҫ���õ� totalFee
	 */
	public void setTotalFee(long totalFee) {
		this.totalFee = totalFee;
	}
	/**
	 * @return picPath
	 */
	public String getPicPath() {
		return picPath;
	}
	/**
	 * @param picPath Ҫ���õ� picPath
	 */
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	

}
