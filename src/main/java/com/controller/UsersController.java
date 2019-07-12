package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exception.WebException;
import com.pojo.Users;
import com.service.UsersService;
import com.utils.JsonResult;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	/**
	 * 跳转页面
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}") 
	public String showPage(@PathVariable String page){
		return page;
	}
	
	@RequestMapping("/addUsers")
	@ResponseBody
	public JsonResult<Integer> addUsers(Users users){
		Integer result = usersService.addUsers(users);
		return JsonResult.SUCCESS(result);
	}
	
	@RequestMapping("/findUsers")
	@ResponseBody
	public JsonResult<List<Users>> findUsers(){
		return usersService.findUsers();
	}
	
	@RequestMapping("/test")
	public void test(){
		throw new WebException(404, "WebException");
	}
}
