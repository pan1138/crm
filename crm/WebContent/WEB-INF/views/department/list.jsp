<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ECSHOP 管理中心-部门列表</title>
<meta name="robots" content="noindex, nofollow">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<jsp:include page="/WEB-INF/views/common.jsp"></jsp:include>
</head>
<body>
<h1>
    <span class="action-span"><a href="${path }/dept_viewEdit.action">添加分类</a></span>
    <span class="action-span1"><a href="__GROUP__">ECSHOP 管理中心</a></span>
    <span id="search_id" class="action-span1">部门列表</span>
    <div style="clear:both"></div>
</h1>
<form method="post" action="" name="listForm">
    <div class="list-div" id="listDiv">
        <table width="100%" cellspacing="1" cellpadding="2" id="list-table">
            <tr>
                <th>部门编号</th>
                <th>部门名称</th>
                <th>负责人</th>
                <th>操作</th>
            </tr>
			<s:iterator var="department" value="#request.list">
            <tr align="center" class="0">
                <td>
               		<s:property value="#department.id"/>
                </td>
                 <td>
               		<s:property value="#department.departmentName"/>
                </td>
                 <td>
               		<s:property value="#department.manager"/>
                </td>
                <td>
                	<s:a href="dept_viewEdit.action?department.id=%{#department.id}">编辑</s:a>
                	<s:a href="dept_delete.action?department.id=%{#department.id}">删除</s:a>
                </td>
            </tr>
            </s:iterator>
        </table>
    </div>
</form>
</body>
</html>