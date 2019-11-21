package com.example.e_softwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    EditText etname, etpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etname= findViewById(R.id.etusername);
        etpassword=findViewById(R.id.etpassword);
        btnlogin=findViewById(R.id.login);

        btnlogin.setOnClickListener(this);

        getSupportActionBar().hide();


    }

    @Override
    public void onClick(View v) {

        validateUsername();
        validatePassword();
        String username = etname.getText().toString();
        String password = etpassword.getText().toString();

        if(username.equals("softwarica") && password.equals("coventry")){
            Intent intent2 = new Intent(this, MainActivity.class);
            startActivity(intent2);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"invalid username or password",Toast.LENGTH_LONG).show();
        }
    }

    public void validateUsername(){
        if(etname.getText().toString().trim().isEmpty()) {
            etname.setError("Enter Username");

        }
    }

    public void validatePassword(){
        if(etpassword.getText().toString().trim().isEmpty()) {
            etpassword.setError("Enter Password");
        }
    }
}
