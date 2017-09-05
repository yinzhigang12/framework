package com.ajiatech.pojo;

import java.util.Date;

public class AjiaContent {
	private long id;
	private long categoryId;
	private String title;
	private String subTitle;
	private String titleDesc;
	private String url;
	private String pic;
	private String pic2;
	private String content;
	private int status;
	private Date created;
	private Date updated;
	
	public AjiaContent() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public AjiaContent(long id, long categoryId, String title, String subTitle, String titleDesc, String url,
			String pic, String pic2, String content, int status, Date created, Date updated) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.title = title;
		this.subTitle = subTitle;
		this.titleDesc = titleDesc;
		this.url = url;
		this.pic = pic;
		this.pic2 = pic2;
		this.content = content;
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
	 * @return categoryId
	 */
	public long getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId 要设置的 categoryId
	 */
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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
	 * @return subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}
	/**
	 * @param subTitle 要设置的 subTitle
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	/**
	 * @return titleDesc
	 */
	public String getTitleDesc() {
		return titleDesc;
	}
	/**
	 * @param titleDesc 要设置的 titleDesc
	 */
	public void setTitleDesc(String titleDesc) {
		this.titleDesc = titleDesc;
	}
	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url 要设置的 url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return pic
	 */
	public String getPic() {
		return pic;
	}
	/**
	 * @param pic 要设置的 pic
	 */
	public void setPic(String pic) {
		this.pic = pic;
	}
	/**
	 * @return pic2
	 */
	public String getPic2() {
		return pic2;
	}
	/**
	 * @param pic2 要设置的 pic2
	 */
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	/**
	 * @return content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content 要设置的 content
	 */
	public void setContent(String content) {
		this.content = content;
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
	}

}
