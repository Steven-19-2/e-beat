package com.example.splash_screen;

public class Storingdata {

    String designation,name,phone,beatarea;
    String sp1s;
    String name1s;
    String loc1s;

    public String getSp1s() {
        return sp1s;
    }

    public void setSp1s(String sp1s) {
        this.sp1s = sp1s;
    }

    public String getName1s() {
        return name1s;
    }

    public void setName1s(String name1s) {
        this.name1s = name1s;
    }

    public String getLoc1s() {
        return loc1s;
    }

    public void setLoc1s(String loc1s) {
        this.loc1s = loc1s;
    }

    public String getH1s() {
        return h1s;
    }

    public void setH1s(String h1s) {
        this.h1s = h1s;
    }

    public String getP1s() {
        return p1s;
    }

    public void setP1s(String p1s) {
        this.p1s = p1s;
    }

    public String getSp2s() {
        return sp2s;
    }

    public void setSp2s(String sp2s) {
        this.sp2s = sp2s;
    }

    public Storingdata(String sp1s, String name1s, String loc1s, String h1s, String p1s, String sp2s) {
        this.sp1s = sp1s;
        this.name1s = name1s;
        this.loc1s = loc1s;
        this.h1s = h1s;
        this.p1s = p1s;
        this.sp2s = sp2s;
    }

    String h1s;
    String p1s;
    String sp2s;

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
