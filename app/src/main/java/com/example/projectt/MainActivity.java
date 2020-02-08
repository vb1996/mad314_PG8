package com.example.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        Button submitbutton;
        EditText usernameditext;
        EditText passwordittext;


        String goodusername="Arsh";
        String goodpassword="12345";


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            usernameditext=findViewById(R.id.username);
            passwordittext=findViewById(R.id.password);


            submitbutton=findViewById(R.id.login);
            submitbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Editable usernameEditable= usernameditext.getText();
                    String usernameView=usernameEditable.toString();

                    Editable passwordEditable= usernameditext.getText();
                    String password =passwordEditable.toString();
                    if(usernameView.equals(goodusername) && (password.equals(goodpassword)))
                    {
                        Intent intent= new Intent(MainActivity.this, second.class);
                        intent.putExtra("username",usernameView);
                        startActivity(intent);
                    }
                }
            });

        }
    }
