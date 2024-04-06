package com.example.atlas2;

public class MainModel {
    String name,city,address,image,Price,veg,time,cusine;

    public MainModel() {
    }

    public MainModel(String name, String city, String address, String image, String price,String veg, String time, String cusine) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.image = image;
        Price = price;
        this.cusine=cusine;
        this.time=time;
        this.veg=veg;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getVeg() {
        return veg;
    }

    public void setVeg(String veg) {
        this.veg = veg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCusine() {
        return cusine;
    }

    public void setCusine(String cusine) {
        this.cusine = cusine;
    }
}
