package com.example.ghost.todaydifferent;

import android.app.Application;

public class GlobalVariable extends Application {
    private Boolean checkLogin = false;
    private String userName = "Lukas";

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
}