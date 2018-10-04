package cn.pan.szu.pojo;

import java.util.Date;

/**
 * 	核心模块：客户移交记录
 * @author Administrator
 *
 */
public class TransferHistory {
	private Long id;      		 	//主键
	private Customer customer;   	//移交的客户
	private Employee oldSeller;	//移交前的营销人员
	private Employee newSeller;	//移交后的营销人员

	private String reason;		//移交的原因
	private Date transferTime;	//移交的时间
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Employee getOldSeller() {
		return oldSeller;
	}
	public void setOldSeller(Employee oldSeller) {
		this.oldSeller = oldSeller;
	}
	public Employee getNewSeller() {
		return newSeller;
	}
	public void setNewSeller(Employee newSeller) {
		this.newSeller = newSeller;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getTransferTime() {
		return transferTime;
	}
	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}
	
}
