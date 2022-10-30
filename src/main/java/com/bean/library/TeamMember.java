package com.bean.library;

import java.util.Date;

public class TeamMember {
 private String name;
 private String stu_number;
 private Date birthday;
 private String hobby;

    public TeamMember() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStu_number(String stu_number) {
        this.stu_number = stu_number;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getStu_number() {
        return stu_number;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getHobby() {
        return hobby;
    }

    public TeamMember(String name, String stu_number, Date birthday, String hobby) {
        this.name = name;
        this.stu_number = stu_number;
        this.birthday = birthday;
        this.hobby = hobby;
    }
}
