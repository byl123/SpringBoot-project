package com.service;

import com.pojo.Users;
import com.utils.JsonResult;

import java.util.List;

public interface UsersService {
	
	Integer addUsers(Users users);

	JsonResult<List<Users>> findUsers();
}
