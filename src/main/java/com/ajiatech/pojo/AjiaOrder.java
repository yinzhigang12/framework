package com.ajiatech.pojo;

import java.util.Date;
import java.util.List;

public class AjiaOrder {
	private String orderId;
	private long userId;
	private long addId;
	private Double payment;
	private Integer paymentType;
	private String postFee;
	private Integer status;
	private Date createTime;
	private Date updateTime;
	private Date paymentTime;
	private Date consignTime;
	private Date endTime;
	private Date closeTime;
	private String shippingName;
	private String shippingCode;
	private String buyerMessage;
	private String buyerNick;
	private Integer buyerRate;
	
	private List<AjiaOrderItem> items;
	
	private AjiaUser user;
	
	public AjiaOrder()
	{
		
	}
	public AjiaOrder(String orderId, long userId, long addId, Double payment, Integer paymentType, String postFee,
			Integer status, Date createTime, Date updateTime, Date paymentTime, Date consignTime, Date endTime,
			Date closeTime, String shippingName, String shippingCode, String buyerMessage, String buyerNick,
			Integer buyerRate) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.addId = addId;
		this.payment = payment;
		this.paymentType = paymentType;
		this.postFee = postFee;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.paymentTime = paymentTime;
		this.consignTime = consignTime;
		this.endTime = endTime;
		this.closeTime = closeTime;
		this.shippingName = shippingName;
		this.shippingCode = shippingCode;
		this.buyerMessage = buyerMessage;
		this.buyerNick = buyerNick;
		this.buyerRate = buyerRate;
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
	 * @return userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId Ҫ���õ� userId
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * @return addId
	 */
	public long getAddId() {
		return addId;
	}
	/**
	 * @param addId Ҫ���õ� addId
	 */
	public void setAddId(long addId) {
		this.addId = addId;
	}
	/**
	 * @return payment
	 */
	public Double getPayment() {
		return payment;
	}
	/**
	 * @param payment Ҫ���õ� payment
	 */
	public void setPayment(Double payment) {
		this.payment = payment;
	}
	/**
	 * @return paymentType
	 */
	public Integer getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType Ҫ���õ� paymentType
	 */
	public void setPaymentType(Integer paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return postFee
	 */
	public String getPostFee() {
		return postFee;
	}
	/**
	 * @param postFee Ҫ���õ� postFee
	 */
	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}
	/**
	 * @return status
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * @param status Ҫ���õ� status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * @return createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime Ҫ���õ� createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime Ҫ���õ� updateTime
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @return paymentTime
	 */
	public Date getPaymentTime() {
		return paymentTime;
	}
	/**
	 * @param paymentTime Ҫ���õ� paymentTime
	 */
	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}
	/**
	 * @return consignTime
	 */
	public Date getConsignTime() {
		return consignTime;
	}
	/**
	 * @param consignTime Ҫ���õ� consignTime
	 */
	public void setConsignTime(Date consignTime) {
		this.consignTime = consignTime;
	}
	/**
	 * @return endTime
	 */
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime Ҫ���õ� endTime
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return closeTime
	 */
	public Date getCloseTime() {
		return closeTime;
	}
	/**
	 * @param closeTime Ҫ���õ� closeTime
	 */
	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}
	/**
	 * @return shippingName
	 */
	public String getShippingName() {
		return shippingName;
	}
	/**
	 * @param shippingName Ҫ���õ� shippingName
	 */
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	/**
	 * @return shippingCode
	 */
	public String getShippingCode() {
		return shippingCode;
	}
	/**
	 * @param shippingCode Ҫ���õ� shippingCode
	 */
	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}
	/**
	 * @return buyerMessage
	 */
	public String getBuyerMessage() {
		return buyerMessage;
	}
	/**
	 * @param buyerMessage Ҫ���õ� buyerMessage
	 */
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	/**
	 * @return buyerNick
	 */
	public String getBuyerNick() {
		return buyerNick;
	}
	/**
	 * @param buyerNick Ҫ���õ� buyerNick
	 */
	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	/**
	 * @return buyerRate
	 */
	public Integer getBuyerRate() {
		return buyerRate;
	}
	/**
	 * @param buyerRate Ҫ���õ� buyerRate
	 */
	public void setBuyerRate(Integer buyerRate) {
		this.buyerRate = buyerRate;
	}
	/**
	 * @return items
	 */
	public List<AjiaOrderItem> getItems() {
		return items;
	}
	/**
	 * @param items Ҫ���õ� items
	 */
	public void setItems(List<AjiaOrderItem> items) {
		this.items = items;
	}
	/**
	 * @return user
	 */
	public AjiaUser getUser() {
		return user;
	}
	/**
	 * @param user Ҫ���õ� user
	 */
	public void setUser(AjiaUser user) {
		this.user = user;
	}
	

}
