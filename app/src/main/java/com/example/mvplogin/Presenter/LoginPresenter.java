package com.example.mvplogin.Presenter;

import com.example.mvplogin.Model.Users;
import com.example.mvplogin.View.ILoginView;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {

        Users user = new Users();
        boolean isLoginSuccess = user.isValid();

        if(isLoginSuccess)
            loginView.onLoginResult("Login Success");
        else
            loginView.onLoginResult("Login error");
    }
}
