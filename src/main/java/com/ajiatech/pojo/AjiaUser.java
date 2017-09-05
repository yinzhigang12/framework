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
		// TODO �Զ����ɵĹ��캯�����
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
	 * @param id Ҫ���õ� id
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
	 * @param userName Ҫ���õ� userName
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
	 * @param passWord Ҫ���õ� passWord
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
	 * @param phone Ҫ���õ� phone
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
	 * @param email Ҫ���õ� email
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
