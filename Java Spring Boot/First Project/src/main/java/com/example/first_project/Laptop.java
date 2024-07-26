package com.example.first_project;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int id;
    private String brand;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString(){
        return "ID: " + id + " Brand: " + brand;
    }

    public void compile(){
        System.out.println("Compiling....");
    }

}
