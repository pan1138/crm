package cn.pan.szu.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.pan.szu.pojo.Customer;
import cn.pan.szu.pojo.Department;
import cn.pan.szu.service.IDepartmentService;


/*
 * 	使用spring自带的测试框架
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/bean.xml")
public class TestApp {
	
	@Resource
	private IDepartmentService departmentService;
	
	@Test
	public void testApp() {
		Department department = new Department();
		department.setDepartmentName("开发部");
		department.setManager("PETER-PAN");
		department.setRemark("主要负责公司的开发业务，系统维护，以及需求的实现！！");
		departmentService.save(department);
	}
	
	@Test
	public void testService() {
		/*Department dept = departmentService.findById(1L);
		dept.setDepartmentName("事务部");
		departmentService.update(dept);*/
		Customer customer = new Customer();
		customer.setStatus(1);
		System.out.println(customer.getStatus());
	}
}
