package com.bootcoding.java.model;

import java.util.Date;

public class Customer {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    private long id;
    private String name;
    private String  emailID;
    private String  password;
    private String  city;
    private String  state;
    private String  deliveryAddress;
    private Date  createdAt;
    private Date    modified;

    public void print(){
        System.out.println(getName());
        System.out.println(getCity());
        System.out.println(getState());
        System.out.println(getDeliveryAddress());
    }
}
