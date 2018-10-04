package cn.pan.szu.service;

import cn.pan.szu.pojo.Employee;

public interface IEmployeeService extends IBaseService<Employee>{
	
	//登陆业务方法
	public Employee login(Employee employee);
}
