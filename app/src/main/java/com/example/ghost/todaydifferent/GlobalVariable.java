package com.example.ghost.todaydifferent;

import android.app.Application;

public class GlobalVariable extends Application {
    private Boolean checkLogin = false;

    public void setLogin(Boolean checkLogin){
        this.checkLogin = checkLogin;
    }

    public Boolean getLogin() {
        return checkLogin;
    }
}