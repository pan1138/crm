package cn.pan.szu.service;

import java.io.Serializable;
import java.util.List;





/**
 *  服务层公用的接口
 * @author Administrator
 *
 */
public interface IBaseService<T> {
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
		
}
