package com.example.constraintlayouteventbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText tEmail, tPassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin = findViewById(R.id.bsignin);

        //Menghubungkan variabel edemail dengan componen button padan layout
        tEmail = findViewById(R.id.tEmail);

        //Menghubungkan variabel edpassword dengan componen button pada layout
        tPassword = findViewById(R.id.tPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = tEmail.getText().toString();
                password = tPassword.getText().toString();

                if (nama.equals("") || password.equals("")) {
                    Toast.makeText(MainActivity.this, "User atau Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    if (nama.equals("henricoz") && password.equals("semogalancar")) {
                        Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    } else {
                        if (password.equals("semogalancarya")) {
                            Toast.makeText(MainActivity.this, "Email Salah", Toast.LENGTH_SHORT).show();
                        } else {
                            if (nama.equals("henricoz")) {
                                Toast.makeText(MainActivity.this, "Password Salah", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(MainActivity.this, "Email dan Password Salah!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }
        });
    }
}