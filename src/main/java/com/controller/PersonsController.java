package com.controller;

import com.pojo.Persons;
import com.service.PersonsService;
import com.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonsController {

    @Autowired
    private PersonsService personsService;

    @PostMapping("/savePersons")
    public JsonResult<Persons> savePersons(Persons persons){
        return this.personsService.savePersons(persons);
    }

    @GetMapping("/findPersonsAll")
    public JsonResult<List<Persons>> findPersonsAll(){
        return this.personsService.findPersonsAll();
    }

    @PostMapping("/deletePersonsById")
    public JsonResult<Persons> deletePersonsById(Long id){
        return this.personsService.deletePersonsById(id);
    }

    @PostMapping("/updatePersonsById")
    public JsonResult<Persons> updatePersonsById(Persons persons){
        return this.personsService.updatePersonsById(persons);
    }
}
