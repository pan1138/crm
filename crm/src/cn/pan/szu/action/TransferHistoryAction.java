package cn.pan.szu.action;

import java.util.List;

import cn.pan.szu.pojo.Customer;
import cn.pan.szu.pojo.Employee;
import cn.pan.szu.pojo.TransferHistory;
import cn.pan.szu.utils.UserContext;

public class TransferHistoryAction extends BaseAction{
	
	private Customer customer;
	private TransferHistory transferHistory;
	
	public TransferHistory getTransferHistory() {
		return transferHistory;
	}

	public void setTransferHistory(TransferHistory transferHistory) {
		this.transferHistory = transferHistory;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	/**
	 *  进入修改页面
	 */
	public String viewEdit() {
		
		//查询客户
		if(customer != null) {
			customer = customerService.findById(customer.getId());
		}
		
		//查询所有营销人员
		List<Employee> employeeList = employeeService.findAll();
		request.put("employeeList", employeeList);
		
		return "edit";
	}
	
	public String save() {
		
		transferHistory.setCustomer(customer);
		
		transferHistory.setOldSeller(UserContext.getUser());
		
		transferHistoryService.save(transferHistory);
		return  "save";
	}
	
	public String list() {
		
		List<TransferHistory> transferHistoryList = transferHistoryService.findAll();
		request.put("transferHistoryList", transferHistoryList);
		return "list";
	}
}
