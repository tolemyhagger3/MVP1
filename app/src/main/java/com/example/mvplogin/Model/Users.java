package com.example.mvplogin.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class Users implements Iusers {

    private String email,passwords;

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPasswords() {
        return passwords;
    }

    @Override
    public boolean isValid() {
        /**
         * check email is empty
         * check email is match patterns
         * check password length>6
         */
        return !TextUtils.isEmpty(getEmail())
                && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()
                && getPasswords().length() <= 6;
    }
}
