package com.ajiatech.pojo;

import java.util.Date;

public class AjiaItem {
	private long id;
	private long cid;
	private String brand;
	private String model;
	private String title;
	private String sellPoint;
	private long price;
	private int num;
	private String barcode;
	private String image;
	private int status;
	private Date created;
	private Date updated;
	
	public AjiaItem() {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	public AjiaItem(long id, long cid, String brand, String model, String title, String sellPoint, long price, int num,
			String barcode, String image, int status, Date created, Date updated) {
		super();
		this.id = id;
		this.cid = cid;
		this.brand = brand;
		this.model = model;
		this.title = title;
		this.sellPoint = sellPoint;
		this.price = price;
		this.num = num;
		this.barcode = barcode;
		this.image = image;
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
	 * @return cid
	 */
	public long getCid() {
		return cid;
	}
	/**
	 * @param cid Ҫ���õ� cid
	 */
	public void setCid(long cid) {
		this.cid = cid;
	}
	/**
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand Ҫ���õ� brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model Ҫ���õ� model
	 */
	public void setModel(String model) {
		this.model = model;
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
	 * @return sellPoint
	 */
	public String getSellPoint() {
		return sellPoint;
	}
	/**
	 * @param sellPoint Ҫ���õ� sellPoint
	 */
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
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
	 * @return barcode
	 */
	public String getBarcode() {
		return barcode;
	}
	/**
	 * @param barcode Ҫ���õ� barcode
	 */
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	/**
	 * @return image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image Ҫ���õ� image
	 */
	public void setImage(String image) {
		this.image = image;
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
