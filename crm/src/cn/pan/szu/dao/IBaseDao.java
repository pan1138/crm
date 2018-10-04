package cn.pan.szu.dao;

import java.io.Serializable;
import java.util.List;

import cn.pan.szu.pojo.Department;
/**
 * 所有公共方法的接口
 * @author Administrator
 *
 */
public interface IBaseDao<T> {
		//保存
		public void save(T t);
		//主键查询
		public T findById(Serializable id);

		//查询全部
		public List<T> findAll();
		
		//更新
		public void update(T t);
		
		//删除
		public void delete(Serializable id); 
		
		//条件查询
		public List<T> findByCondition(String hql,Object... params);
}
