package cn.pan.szu.service;

import java.util.List;

import cn.pan.szu.pojo.Customer;

public interface ICustomerService extends IBaseService<Customer>{
	public List<Customer> getByStatus(int status);
}
