package cn.pan.szu.utils;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.pan.szu.pojo.Employee;

/**
 *  用户的上下文类，往session中放入登陆用户或者获取登陆用户
 * @author Administrator
 *
 */
public class UserContext {
	
	
	private static final String USER_INF = "user_info";
	
	
	//设置登陆用户
	public static void setUser(Employee employee) {
		Map<String,Object> session = ActionContext.getContext().getSession();
		session.put(USER_INF, employee);
	}
	
	
	//获取登陆用户
	public static Employee getUser() {
		Map<String,Object> session = ActionContext.getContext().getSession();
		return (Employee) session.get(USER_INF);
	}


	public static void out() {
		Map<String,Object> session = ActionContext.getContext().getSession();
		session.remove(USER_INF);
	}
}
