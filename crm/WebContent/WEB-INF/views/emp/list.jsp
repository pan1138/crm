<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心 - 员工列表 </title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<jsp:include page="/WEB-INF/views/common.jsp"/>
<script language="javascript">
	function confirmDelete(){
		if(confirm("是否删除？")){
		 	return true;
		}else{
			return false;
		} 
	}
</script>
</head>
<body>
<h1>
    <span class="action-span"><a href="${path }/emp_viewEdit.action">添加新员工</a></span>
    <span class="action-span1"><a href="__GROUP__">CRM</a></span>
    <span id="search_id" class="action-span1"> - 员工列表 </span>
    <div style="clear:both"></div>
</h1>
<div class="form-div">
    <form action="" name="searchForm">
        <img src="${path }/Images/icon_search.gif" width="26" height="22" border="0" alt="search" />
  
        <select name="intro_type">
            <option value="0">全部</option>
            <option value="is_best">精品</option>
            <option value="is_new">新品</option>
            <option value="is_hot">热销</option>
        </select>
        <!-- 上架 -->
        <select name="is_on_sale">
            <option value=''>全部</option>
            <option value="1">上架</option>
            <option value="0">下架</option>
        </select>
        <!-- 关键字 -->
        关键字 <input type="text" name="keyword" size="15" />
        <input type="submit" value=" 搜索 " class="button" />
    </form>
</div>

<!-- 员工列表 -->
<form method="post" action="" name="listForm" onsubmit="">
    <div class="list-div" id="listDiv">
        <table cellpadding="3" cellspacing="1">
            <tr>
                <th>编号</th>
                <th>员工名称</th>
                <th>真实姓名</th>
                <th>登陆时间</th>
                <th>电话</th>
                <th>Email</th>
                <th>部门</th>
                <th>操作</th>
            </tr>
            	<s:iterator var="emp" value="#request.employeeList">
            		<tr>
            			 <td align="center"><s:property value="#emp.id"/></td>
			             <td align="center"><s:property value="#emp.name"/></td>
			             <td align="center"><s:property value="#emp.trueName"/></td>
			             <td align="center"><s:date name="#emp.loginTime" format="yyyy-MM-dd HH:mm:ss"/></td>
			             <td align="center"><s:property value="#emp.tel"/></td>
			             <td align="center"><s:property value="#emp.email"/></td>
			             <td align="center"><s:property value="#emp.department.departmentName"/></td>   
			             <td align="center">
		                 <a href="__APP__/Goods/?goods_id=<{$val.goods_id}>" target="_blank" title="查看"><img src="./Images/icon_view.gif" width="16" height="16" border="0" /></a>
		                 <a href='${path }/emp_viewEdit.action?employee.id=<s:property value="#emp.id"/>' title="编辑"><img src="./Images/icon_edit.gif" width="16" height="16" border="0" /></a>
		                 <a href='${path }/emp_delete.action?employee.id=<s:property value="#emp.id"/>' onclick="javascript:return confirmDelete()" title="回收站"><img src="./Images/icon_trash.gif" width="16" height="16" border="0" /></a></td>   
            		</tr>
            	</s:iterator>
        </table>

    <!-- 分页开始 
        <table id="page-table" cellspacing="0">
            <tr>
                <td width="80%">&nbsp;</td>
                <td align="center" nowrap="true">
                    <{$showPage}>
                </td>
            </tr>
        </table>
        -->
    <!-- 分页结束 -->
    </div>
</form>

<div id="footer">
共执行 7 个查询，用时 0.028849 秒，Gzip 已禁用，内存占用 3.219 MB<br />
版权所有 &copy; 2005-2012 上海商派网络科技有限公司，并保留所有权利。</div>
</body>
</html>