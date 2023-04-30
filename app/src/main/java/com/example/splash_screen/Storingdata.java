package com.example.splash_screen;

public class Storingdata {

    String a,b,c,d;

    public Storingdata() {
    }

    public Storingdata(String a, String b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String getDesignation() {
        return a;
    }

    public void setDesignation(String designation) {
        this.a = designation;
    }

    public String getName() {
        return b;
    }

    public void setName(String name) {
        this.b = name;
    }

    public String getPhone() {
        return c;
    }

    public void setPhone(String phone) {
        this.c = phone;
    }

    public String getBeatarea() {
        return d;
    }

    public void setBeatarea(String beatarea) {
        this.d = beatarea;
    }
}
