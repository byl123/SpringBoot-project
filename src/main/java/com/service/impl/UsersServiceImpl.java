package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.dao.UsersDao;
import com.pojo.Users;
import com.service.UsersService;
import com.utils.JsonResult;
import com.utils.PageInfo;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public Integer addUsers(Users users) {
		Users save = usersDao.save(users);
		if(save!=null)
			return 1;
		return 0;
	}

	@Override
	public JsonResult<List<Users>> findUsers() {
		Sort sort = Sort.by(Direction.DESC,"userid");
		Pageable pageable = PageRequest.of(0, 2, sort);
		Page<Users> pageData = usersDao.findAll(pageable);
		PageInfo pageInfo = new PageInfo(pageData.getTotalElements(),pageData.getTotalPages(), 0, pageData.getSize());
		return JsonResult.SUCCESS(pageData.getContent(), pageInfo);
	}

}
