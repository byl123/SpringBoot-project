package com.service.impl;

import com.dao.PersonsDao;
import com.pojo.Persons;
import com.service.PersonsService;
import com.utils.CombineBeans;
import com.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonsServiceImpl implements PersonsService {

    @Autowired
    private PersonsDao personsDao;

    @Override
    public JsonResult<Persons> savePersons(Persons persons) {
        Persons save = this.personsDao.save(persons);
        if (save !=null ){
            return JsonResult.SUCCESS();
        }
        return JsonResult.FAIL();
    }

    @Override
    public JsonResult<List<Persons>> findPersonsAll() {
        List<Persons> persons = this.personsDao.findAll();
        if(persons!=null) {
            return JsonResult.SUCCESS(persons);
        }
        return JsonResult.FAIL();
    }

    @Override
    public JsonResult<Persons> deletePersonsById(Long id) {
        this.personsDao.deleteById(id);
        return JsonResult.SUCCESS();
    }

    @Override
    public JsonResult<Persons> updatePersonsById(Persons persons) {
        // 先查询出之前的数据
        Persons oldPersons = this.personsDao.findById(persons.getId()).orElse(null);
        // 然后将原来的数据复制到穿进来的对象中，否则直接进行更新操作会将字段为null的也更新成null
        Persons newPersons = (Persons) CombineBeans.combineSydwCore(persons,oldPersons);
        Persons save = this.personsDao.save(newPersons);
        if (save !=null ){
            return JsonResult.SUCCESS();
        }
        return JsonResult.FAIL();
    }
}
