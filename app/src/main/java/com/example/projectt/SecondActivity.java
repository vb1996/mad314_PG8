package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText firstname;
    EditText lastname;
    EditText emailid;
    EditText password;
    Button submit;
    //database
    String goodfirstname = "Gagan";
    String goodlastname ="deep";
    String goodemailid ="gagan@gmail.com";
    String goodpassword = "1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        firstname= findViewById(R.id.editText);
        lastname = findViewById(R.id.editText2);
        emailid = findViewById(R.id.editText3);
        password = findViewById(R.id.editText4);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable usernameEditable = firstname.getText();
                String username = usernameEditable.toString();
                Editable passwordEditable = password.getText();
                String password = passwordEditable.toString();
                System.out.println();
                if (username.equals(goodfirstname) && password.equals(goodpassword)) {
                    Toast.makeText(getApplicationContext(), username + "  login success!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
}

