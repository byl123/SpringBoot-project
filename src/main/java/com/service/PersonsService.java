package com.service;

import com.pojo.Persons;
import com.utils.JsonResult;

import java.util.List;

public interface PersonsService {

    JsonResult<Persons> savePersons(Persons persons);

    JsonResult<List<Persons>> findPersonsAll();

    JsonResult<Persons> deletePersonsById(Long id);

    JsonResult<Persons> updatePersonsById(Persons persons);
}
