package cn.pan.szu.service.impl;

import java.io.Serializable;
import java.util.List;

import cn.pan.szu.dao.IDepartmentDao;
import cn.pan.szu.pojo.Department;
import cn.pan.szu.service.IDepartmentService;

public class DepartmentService implements IDepartmentService {

	private IDepartmentDao departmentDao;
	
	public void setDepartmentDao(IDepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	
	/**
	 * 事务控制是在service方法上实现的
	 */
	@Override
	public void save(Department department) {
		departmentDao.save(department);
	}


	@Override
	public Department findById(Serializable id) {
		return departmentDao.findById(id);
	}


	@Override
	public List<Department> findAll() {
		return departmentDao.findAll();
	}


	@Override
	public void update(Department department) {
		departmentDao.update(department);
	}


	@Override
	public void delete(Serializable id) {
		departmentDao.delete(id);
	}

}
