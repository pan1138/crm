package cn.pan.szu.action;

import java.util.List;

import cn.pan.szu.pojo.Customer;
import cn.pan.szu.pojo.TraceHistory;
import cn.pan.szu.utils.UserContext;

public class TraceHistoryAction extends BaseAction {
	
	private Customer customer;
	private TraceHistory traceHistory;
	
	public TraceHistory getTraceHistory() {
		return traceHistory;
	}


	public void setTraceHistory(TraceHistory traceHistory) {
		this.traceHistory = traceHistory;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	/**
	 *  进入客户跟进历史页面
	 * @return
	 */
	public String viewEdit() {
		if (customer != null) {
			customer = customerService.findById(customer.getId());
		}
		return "edit";
	}
	
	public String save() {
		//封装数据
		customer = customerService.findById(customer.getId());
		traceHistory.setCustomer(customer);
		traceHistory.setEmployee(UserContext.getUser());
		traceHistoryService.save(traceHistory);
		return "save";
	}
	
	public String list() {
		List<TraceHistory> traceHistoryList = traceHistoryService.findAll();
		request.put("traceHistoryList", traceHistoryList);
		return "list";
	}
}
