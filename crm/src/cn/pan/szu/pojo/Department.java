package cn.pan.szu.pojo;

public class Department {
	/*
	 * 部门id
	 */
	private Long id;
	/*
	 * 部门名称
	 */
	private String departmentName;
	/*
	 * 部门管理者
	 */
	private String manager;
	/*
	 * 部门备注
	 */
	private String remark;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
