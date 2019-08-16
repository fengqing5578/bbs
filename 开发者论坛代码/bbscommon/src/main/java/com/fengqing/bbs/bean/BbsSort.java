package com.fengqing.bbs.bean;

import java.io.Serializable;

/*
分类实体
 */
public class BbsSort implements Serializable{
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
