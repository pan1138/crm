package cn.pan.szu.dao.impl;


import cn.pan.szu.dao.ICustomerDao;
import cn.pan.szu.pojo.Customer;

/**
 * 对Department对象的持久层操作类，继承spring对hibernate支持的操作工具类
 *  	注意：需向DepartmentDao注入SessionFactory对象或HibernateTemplate对象
 * @author Administrator
 *
 */
public class CustomerDao extends BaseDao<Customer> implements ICustomerDao{

}
