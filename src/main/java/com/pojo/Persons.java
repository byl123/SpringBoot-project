package com.pojo;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_persons")
@DynamicUpdate(true)
public class Persons extends BasePojo{

    @Column(name="persons_name",columnDefinition="VARCHAR(32) COMMENT '姓名' ")
    private String personsName;
    @Column(name="persons_gender",columnDefinition="VARCHAR(32) COMMENT '性别' ")
    private String personsGender;
    @Column(name="persons_age",columnDefinition="TINYINT(4) COMMENT '年龄' ")
    private Byte personsAge;

    public String getPersonsName() {
        return personsName;
    }

    public void setPersonsName(String personsName) {
        this.personsName = personsName;
    }

    public String getPersonsGender() {
        return personsGender;
    }

    public void setPersonsGender(String personsGender) {
        this.personsGender = personsGender;
    }

    public Byte getPersonsAge() {
        return personsAge;
    }

    public void setPersonsAge(Byte personsAge) {
        this.personsAge = personsAge;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "personsName='" + personsName + '\'' +
                ", personsGender='" + personsGender + '\'' +
                ", personsAge=" + personsAge +
                ", id=" + id +
                ", createdUser='" + createdUser + '\'' +
                ", createdDate=" + createdDate +
                ", modifyedUser='" + modifyedUser + '\'' +
                ", modifyedDate=" + modifyedDate +
                '}';
    }
}
