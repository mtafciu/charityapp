package com.example.ghost.todaydifferent;

import android.app.Application;

public class GlobalVariable extends Application {
    private Boolean checkLogin = false;
    private String userName = "Lukas";
    private int lukasPoint = 0;
    private int amyPoint = 0;

    public void setLogin(Boolean checkLogin){
        this.checkLogin = checkLogin;
    }

    public Boolean getLogin() {
        return checkLogin;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setAmyPoint(int amyPoint) {
        this.amyPoint = amyPoint;
    }

    public int getAmyPoint() {
        return amyPoint;
    }

    public void setLukasPoint(int lukasPoint) {
        this.lukasPoint = lukasPoint;
    }

    public int getLukasPoint() {
        return lukasPoint;
    }
}