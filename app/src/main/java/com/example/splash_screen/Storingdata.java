package com.example.splash_screen;

public class Storingdata {

    String designation,name,phone,beatarea;

    public Storingdata() {
    }

    public Storingdata(String designation, String name, String phone, String beatarea) {
        this.designation = designation;
        this.name = name;
        this.phone = phone;
        this.beatarea = beatarea;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBeatarea() {
        return beatarea;
    }

    public void setBeatarea(String beatarea) {
        this.beatarea = beatarea;
    }
}
