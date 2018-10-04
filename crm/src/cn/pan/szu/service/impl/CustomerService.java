package cn.pan.szu.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.pan.szu.dao.ICustomerDao;
import cn.pan.szu.pojo.Customer;
import cn.pan.szu.service.ICustomerService;

public class CustomerService implements ICustomerService {

	private ICustomerDao customerDao;
	
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	
	/**
	 * 事务控制是在service方法上实现的
	 */
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}


	@Override
	public Customer findById(Serializable id) {
		return customerDao.findById(id);
	}


	@Override
	public List<Customer> findAll() {
		return customerDao.findAll();
	}


	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
	}


	@Override
	public void delete(Serializable id) {
		customerDao.delete(id);
	}


	@Override
	public List<Customer> getByStatus(int status) {
		String hql = "from Customer where status=?";
		return customerDao.findByCondition(hql, status);
	}

}
