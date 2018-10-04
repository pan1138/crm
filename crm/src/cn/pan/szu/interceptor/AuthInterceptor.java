package cn.pan.szu.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import cn.pan.szu.pojo.Employee;
import cn.pan.szu.utils.UserContext;

public class AuthInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		//获取用户
		Employee emp = UserContext.getUser();
		
		if(emp != null) {
			//若用户不为空，则表示当前处于登陆状态，放行至下一拦截器
			return invocation.invoke(); 
		}
		
		//若用户为空，则返回input登陆视图
		return "input";
	}

}
