package cn.pan.szu.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import cn.pan.szu.service.ICustomerService;
import cn.pan.szu.service.IDepartmentService;
import cn.pan.szu.service.IEmployeeService;
import cn.pan.szu.service.ITraceHistoryService;
import cn.pan.szu.service.ITransferHistoryService;

/**
 *  所有域对象的map对象在该类接收
 *  所有的service都在该类中接收ioc容器注入
 * @author Administrator
 *	需要用到service和域对象集合的action类须继承该类
 */

public abstract class BaseAction extends ActionSupport implements SessionAware,RequestAware,ApplicationAware{
	protected Map<String,Object> request;
	protected Map<String,Object> session;
	protected Map<String,Object> application;
	protected IDepartmentService departmentService;
	protected IEmployeeService employeeService;
	protected ICustomerService customerService;
	protected ITraceHistoryService traceHistoryService;
	protected ITransferHistoryService transferHistoryService;
	
	public void setTransferHistoryService(ITransferHistoryService transferHistoryService) {
		this.transferHistoryService = transferHistoryService;
	}
	public void setTraceHistoryService(ITraceHistoryService traceHistoryService) {
		this.traceHistoryService = traceHistoryService;
	}
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
