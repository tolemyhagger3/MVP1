package com.example.mvplogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvplogin.Presenter.ILoginPresenter;
import com.example.mvplogin.Presenter.LoginPresenter;
import com.example.mvplogin.View.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private EditText email,password;
    private Button CheckerButton;

    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        CheckerButton = (Button) findViewById(R.id.email_sign_in_button);

        //init
         loginPresenter = new LoginPresenter(MainActivity.this);

         //Events
        CheckerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.onLogin(email.getText().toString(),
                        password.getText().toString());
            }
        });
    }



    @Override
    public void onLoginResult(String messages) {
        Toast.makeText(this, messages, Toast.LENGTH_SHORT).show();
    }
}