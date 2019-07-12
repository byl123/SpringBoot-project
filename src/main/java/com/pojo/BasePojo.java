package com.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体公共类
 */
@MappedSuperclass
public abstract class BasePojo implements Serializable {

    /**
     *
     */
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",columnDefinition="BIGINT COMMENT '主键id' ")
    public Long id;

    @Column(name="created_user",columnDefinition="VARCHAR(32) COMMENT '创建人' ")
    public String createdUser;

    @CreationTimestamp // 创建时自动添加时间
    @Column(name="created_date",columnDefinition="DATETIME COMMENT '创建时间' ")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date createdDate;

    @Column(name="modifyd_user",columnDefinition="VARCHAR(32) COMMENT '修改人' ")
    public String modifyedUser;

    @UpdateTimestamp //修改时自动更新时间
    @Column(name="modifyed_date",columnDefinition="DATETIME COMMENT '修改时间' ")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date modifyedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifyedUser() {
        return modifyedUser;
    }

    public void setModifyedUser(String modifyedUser) {
        this.modifyedUser = modifyedUser;
    }

    public Date getModifyedDate() {
        return modifyedDate;
    }

    public void setModifyedDate(Date modifyedDate) {
        this.modifyedDate = modifyedDate;
    }
}
