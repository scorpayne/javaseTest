/**
 * Chengzai.com Inc. 
 * Copyright (c) 2016-2017 All Rights Reserved. 
 */
package com.payne.entity;

import com.payne.enums.TaskBizTypeEnum;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author peng.dengp
 * @version $Id: DeathCopy, v 0.1 2017-09-19 16:44 peng.dengp Exp $
 */
public class Death implements Serializable{
    private static final long serialVersionUID = -1645367901736083426L;

    private String name;

    private int age;

    private TaskBizTypeEnum taskBizType;

    private String bizContext;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        DeathCopy death = (DeathCopy) o;
//        return Objects.equals(name, death.name);
//    }
//
//    @Override public int hashCode() {
//        return Objects.hash(name);
//    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Death death = (Death) o;

        return name != null ? name.equals(death.name) : death.name == null;
    }

    @Override public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    //    @Override public boolean equals(Object o) {
//        if (this == o)
//            return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//
//        DeathCopy death = (DeathCopy) o;
//
//        if (age != death.age)
//            return false;
//        return name != null ? name.equals(death.name) : death.name == null;
//    }
//
//    @Override public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + age;
//        return result;
//    }

    public TaskBizTypeEnum getTaskBizType() {
        return taskBizType;
    }

    public void setTaskBizType(TaskBizTypeEnum taskBizType) {
        this.taskBizType = taskBizType;
    }

    public String getBizContext() {
        return bizContext;
    }

    public void setBizContext(String bizContext) {
        this.bizContext = bizContext;
    }
}
