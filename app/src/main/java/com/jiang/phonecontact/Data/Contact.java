package com.jiang.phonecontact.Data;

public class Contact {
    private String name;
    private String phoneNum;

    public Contact(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public Contact() {
        this.name = null;
        this.phoneNum = null;
    }


    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
