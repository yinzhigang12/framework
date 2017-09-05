package com.ajiatech.pojo;

import java.util.Date;

public class AjiaUser {
	private long id;
	private String userName;
	private String passWord;
	private String phone;
	private String email;
	private Date created;
	private Date updated;
	
	public AjiaUser() {
		// TODO 自动生成的构造函数存根
	}
	public AjiaUser(long id, String userName, String passWord, String phone, String email, Date created, Date updated) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.phone = phone;
		this.email = email;
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
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName 要设置的 userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return passWord
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * @param passWord 要设置的 passWord
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 * @return phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone 要设置的 phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email 要设置的 email
	 */
	public void setEmail(String email) {
		this.email = email;
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
