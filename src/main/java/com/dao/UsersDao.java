package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.pojo.Users;

public interface UsersDao extends JpaRepository<Users, Integer>,JpaSpecificationExecutor<Users>{

}
