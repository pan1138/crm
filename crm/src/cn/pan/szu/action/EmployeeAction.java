package cn.pan.szu.action;

import java.util.List;

import cn.pan.szu.pojo.Department;
import cn.pan.szu.pojo.Employee;

public class EmployeeAction extends BaseAction{
	
	private Employee employee;
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	//1.进入员工编辑
	public String viewEdit() {
		
		//判断员工id是否为空，若不为空，则根据主键查询，供jsp页面回显
		if(employee != null && employee.getId() != null) {
			employee = employeeService.findById(employee.getId());
		}
		List<Department> departmentList = departmentService.findAll();
		request.put("departmentList", departmentList);
		return "viewEdit";
	}
	
	//2.员工列表页面
	public String list() {
		List<Employee> employeeList = employeeService.findAll();
		request.put("employeeList", employeeList);
		return "list";
	}
	
	//3.添加员工信息
	public String save() {
		employeeService.save(employee);
		return "edit";
	}
	
	//4.修改员工信息
	public String update() {
		employeeService.update(employee);
		return "edit";
	}
	
	//5.删除员工信息
	public String delete() {
		employeeService.delete(employee.getId());
		return "edit";
	}
}
