package com.personal.CarMall.web.entity;

public class Car {
    private int id;         //编号
    private String name;    //车名
    private String model;  //型号
    private String color;   //颜色
    private double price;   //价钱

    public Car(){

    }

    public Car(int id, String name, String model, String color, double price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
