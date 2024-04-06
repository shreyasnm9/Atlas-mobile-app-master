package com.example.atlas2;

public class tourMainModel {
    String ttime,tticket,tname,timage,tcity,taddress;

    public tourMainModel(String ttime, String tticket, String tname, String timage, String tcity, String taddress) {
        this.ttime = ttime;
        this.tticket = tticket;
        this.tname = tname;
        this.timage = timage;
        this.tcity = tcity;
        this.taddress = taddress;
    }

    public String getTtime() {
        return ttime;
    }

    public void setTtime(String ttime) {
        this.ttime = ttime;
    }

    public String getTticket() {
        return tticket;
    }

    public void setTticket(String tticket) {
        this.tticket = tticket;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTimage() {
        return timage;
    }

    public void setTimage(String timage) {
        this.timage = timage;
    }

    public String getTcity() {
        return tcity;
    }

    public void setTcity(String tcity) {
        this.tcity = tcity;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }
}
