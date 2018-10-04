package cn.pan.szu.action;

import java.util.List;

import cn.pan.szu.pojo.Customer;
public class CustomerAction extends BaseAction{
	
	private Customer customer;
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	//1.进入客户编辑
	public String viewEdit() {
		
		//判断客户id是否为空，若不为空，则根据主键查询，供jsp页面回显
		if(customer != null && customer.getId() != null) {
			customer = customerService.findById(customer.getId());
		}
		
		return "viewEdit";
	}
	
	//2.客户列表页面
	public String list() {
		List<Customer> customerList = customerService.findAll();
		request.put("customerList", customerList);
		return "list";
	}
	
	//3.添加客户信息
	public String save() {
		//新增的客户状态为1
		customer.setStatus(1);
		System.out.println(customer.getBirth());
		customerService.save(customer);
		return "edit";
	}
	
	//4.修改客户信息
	public String update() {
		customerService.update(customer);
		return "edit";
	}
	
	//5.删除客户信息
	public String delete() {
		customerService.delete(customer.getId());
		return "edit";
	}
	
	//6.作废,认领
	public String updateStatus() {
		Customer c = customerService.findById(customer.getId());
		c.setStatus(customer.getStatus());
		
		customerService.update(c);
		return "edit";
	}
	
	//资源池
	public String findByStatus() {
		List<Customer> customerList = customerService.getByStatus(0);
		request.put("customerList", customerList);
		return "listByStatus";
	}
}
