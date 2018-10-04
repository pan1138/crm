package cn.pan.szu.action;

import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport{
	
	public String execute() {
		return "success";
	}
	
	public String top() {
		return "top";	
	}
	
	public String menu() {
		return "menu";
	}
	
	public String index() {
		return "index";
	}
}
