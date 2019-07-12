package com.dao;

import com.pojo.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonsDao extends JpaRepository<Persons,Long>, JpaSpecificationExecutor<Persons> {
}
