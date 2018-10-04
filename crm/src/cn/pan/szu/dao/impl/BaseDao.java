package cn.pan.szu.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.pan.szu.dao.IBaseDao;


/**
 * 所有dao公用方法的实现
 * @author Administrator
 *
 * @param <T>
 */
public abstract class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T> {

	private Class<T> clazz;
	
	
	//构造函数方法，只会在子类创建时被调用，调用者为子类，可通过反射泛型来获取子类的泛型
	public BaseDao() {
		//获取父类类型
		Type type = this.getClass().getGenericSuperclass();
		//将type强转为ParameterizedType类型，即参数化类型
		ParameterizedType pType = (ParameterizedType) type;
		//获取父类参数化类型的泛型类型数组
		Type[] types = pType.getActualTypeArguments();
		//将其泛型类型赋值给clazz
		this.clazz = (Class) types[0];
	}
	
	@Override
	public void save(T t) {
		this.getHibernateTemplate().save(t);
	}

	@Override
	public T findById(Serializable id) {
		return this.getHibernateTemplate().get(clazz, id);
	}

	@Override
	public List<T> findAll() {
		return this.getHibernateTemplate().loadAll(clazz);
	}

	@Override
	public void update(T t) {
		this.getHibernateTemplate().update(t);
	}

	@Override
	public void delete(Serializable id) {
		T t = this.getHibernateTemplate().get(clazz, id);
		this.getHibernateTemplate().delete(t);
	}

	@Override
	public List<T> findByCondition(String hql, Object... params) {
		
		return getHibernateTemplate().find(hql, params);
	}
}
