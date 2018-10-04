package cn.pan.szu.action;

import cn.pan.szu.pojo.Employee;
import cn.pan.szu.utils.UserContext;

public class LoginAction extends BaseAction{
	
	//从页面中封装数据
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String login() {
		//调用service层方法进行登陆
		Employee emp = employeeService.login(employee);
		
		//判断是否登陆成功
		if(emp != null) {
			//登陆成功,将用户放入session中
			UserContext.setUser(emp);
			return SUCCESS;
		}else {
			//登陆失败
			return INPUT;
		}
	}
	
	//退出登陆
	public String out() {
		
		//退出登陆，移出session中的用户
		UserContext.out();
		return INPUT;
	}
}
