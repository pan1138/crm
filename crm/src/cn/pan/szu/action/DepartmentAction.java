package cn.pan.szu.action;

import java.util.List;

import cn.pan.szu.pojo.Department;


public class DepartmentAction extends BaseAction{
	//接收页面传入请求参数
	private Department department;
	
	//添加成功后直接返回list页面
	public String save() {
		departmentService.save(department);
		return list();
	}
	
	public String list() {
		List<Department> list = departmentService.findAll();
		request.put("list", list);
		return "list";
	}
	
	public String findById() {
		Department department = departmentService.findById(1L);
		System.out.println(department);
		return "success";
	}
	
	public String viewEdit(){
		//若是要修改部门信息，需根据主键查询对象
		
		if(department != null) {
			if(department.getId() != null) {
				//根据主键查询，查询到的结果放入到值栈根元素中，供页面回显
				this.department = departmentService.findById(department.getId());
			}
		}
		
		return "viewEdit";
	}
	
	public String delete() {
		departmentService.delete(department.getId());
		return list();
	}
	public String update() {
		
		departmentService.update(department);
		
		//修改成功后重新查询，并跳转到列表
		return list();
	}
	
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
