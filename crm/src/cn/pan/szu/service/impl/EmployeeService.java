package cn.pan.szu.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.pan.szu.dao.IEmployeeDao;
import cn.pan.szu.pojo.Employee;
import cn.pan.szu.service.IEmployeeService;

public class EmployeeService implements IEmployeeService{

	private IEmployeeDao employeeDao;
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	public Employee findById(Serializable id) {
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public void update(Employee employee) {
		employeeDao.update(employee);
	}

	@Override
	public void delete(Serializable id) {
		employeeDao.delete(id);
	}

	@Override
	public Employee login(Employee employee) {
		String hql = "from Employee where name=? and password=?";
		List<Employee> list = employeeDao.findByCondition(hql, employee.getName(),employee.getPassword());
		if(list != null && list.size() > 0) {
			//登陆成功
			return list.get(0);
		}else {
			
			//登陆失败
			return null;
		}
	}
}
