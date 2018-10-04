<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 添加员工</title>
<meta name="robots" content="noindex, nofollow">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<jsp:include page="/WEB-INF/views/common.jsp"></jsp:include>
<script language="javascript">
	//修改表单，获取地址
	 function changeForm(){
		//获取表单对象
		var frm = document.forms[0];
		
		//获取id
		var id = document.getElementById('employee.id').value;
		if(id == ''){
			
			//若id为空，则为添加
			frm.action = "${path }/emp_save.action";
		}else{
			
			//若id不为空，则为修改
			frm.action = "${path }/emp_update.action"
		}
		
		frm.submit();
	}
</script>
</head>
<body>
<h1>
    <span class="action-span"><a href="__GROUP__/Category/categoryList">员工分类</a></span>
    <span class="action-span1"><a href="__GROUP__">CRM</a></span>
    <span id="search_id" class="action-span1"> - 添加员工 </span>
    <div style="clear:both"></div>
</h1>
<div class="main-div">
    <form method="post">
    
    <!-- 隐藏域，保存id值 -->
    <s:hidden name="employee.id" id="employee.id" value="%{employee.id}"></s:hidden>
    <s:hidden name="employee.loginTime" id="employee.loginTime" value="%{employee.loginTime}"></s:hidden>
    <s:hidden name="employee.lastLoginTime" id="employee.lastLoginTime" value="%{employee.lastLoginTime}"></s:hidden>
    <s:hidden name="employee.ip" id="employee.ip" value="%{employee.ip}"></s:hidden>
    <s:hidden name="employee.lastLoginIp" id="employee.lastLoginIp" value="%{employee.lastLoginIp}"></s:hidden>
        <table width="100%" id="general-table">
            <tr>
                <td class="label">员工名称:</td>
                <td>
                    <s:textfield name="employee.name"></s:textfield>
                </td>
            </tr>
            <tr>
            	<td class="label">部门</td>
            	<td>
            		<s:select name="employee.department.id" 
            				  headerKey="-1"
            				  headerValue="请选择"
            				  list="#request.departmentList"
            				  listKey="id"
            				  listValue="departmentName"></s:select>
            	</td>
            </tr>
            <tr>
                <td class="label">员工真实姓名:</td>
                <td>
                    <s:textfield name="employee.trueName"></s:textfield>
                </td>
            </tr>
            <tr>
                <td class="label">密码:</td>
                <td>
                    <s:password name="employee.password" showPassword="true"></s:password>
                </td>
            </tr>
            <tr>
                <td class="label">电话:</td>
                <td>
                    <s:textfield name="employee.tel"></s:textfield>
                </td>
            </tr>
            <tr>
                <td class="label">Email:</td>
                <td>
                    <s:textfield name="employee.email"></s:textfield>
                </td>
            </tr>
        </table>
        <div class="button-div">
            <input type="button" value=" 确定 " onclick="changeForm()"/>
            <input type="reset" value=" 重置 " />
        </div>
    </form>
</div>

<div id="footer">
共执行 3 个查询，用时 0.162348 秒，Gzip 已禁用，内存占用 2.266 MB<br />
版权所有 &copy; 2005-2012 上海商派网络科技有限公司，并保留所有权利。</div>

</body>
</html>