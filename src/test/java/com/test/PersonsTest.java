package com.test;

import com.Application;
import com.pojo.Persons;
import com.service.PersonsService;
import com.utils.JsonResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class PersonsTest {

    @Autowired
    private PersonsService personsService;

    @Test
    public void saveTest(){
        Persons persons = new Persons();
        persons.setPersonsName("黄飞鸿");
        persons.setPersonsAge((byte) 20);
        persons.setPersonsGender("男");
        JsonResult<Persons> result = this.personsService.savePersons(persons);
        System.out.println(result.getMessage());
    }

    @Test
    public void updateTest(){
        Persons persons = new Persons();
        persons.setId(1L);
        persons.setPersonsName("陆游");
        persons.setPersonsAge((byte) 20);
        JsonResult<Persons> result = this.personsService.updatePersonsById(persons);
        System.out.println(result.getMessage());
    }
}
