package com.example.healthcareapp;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {
    private TextView tv;
    private Button btn;
    private EditText edusername, edemail, edpass, edconfirmPass;
    private ImageView im1,im2,im3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        tv = findViewById(R.id.textViewRegisterLogin);
        btn = findViewById(R.id.registerButtonApp);
        edusername = findViewById(R.id.editTextBMBFullName);
        edemail = findViewById(R.id.editTextRegisterEmail);
        edpass = findViewById(R.id.editTextRegisterPassword);
        edconfirmPass = findViewById(R.id.editTextRegisterConfirmPassword);
        im1=findViewById(R.id.imgg);
        im2=findViewById(R.id.imfb);
        im3=findViewById(R.id.imtw);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterPage.this, LoginPage.class));
            }
        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/QuocCuong17";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.facebook.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.twitter.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edusername.getText().toString();
                String email = edemail.getText().toString();
                String password = edpass.getText().toString();
                String confirm = edconfirmPass.getText().toString();

                if (username.length() == 0 || email.length() == 0 || password.length() == 0 || confirm.length() == 0) {
                    Toast.makeText(RegisterPage.this, "Please fill the credentials", Toast.LENGTH_SHORT).show();
                } else {
                    if (password.compareTo(confirm) == 0) {
                        if (isValid(password)) {
                            Toast.makeText(RegisterPage.this, "Record Inserted", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegisterPage.this, LoginPage.class));
                        } else {
                            Toast.makeText(RegisterPage.this, "Password must contain at least 8 characters, having letter, digit & special symbol", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(RegisterPage.this, "Password and confirm password didn't match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
    });
}
    public static boolean isValid(String passwordHere) {
        int f1 = 0, f2 = 0, f3 = 0;
        if (passwordHere.length() < 8) {
            return false;
        } else {
            for (int p = 0; p < passwordHere.length(); p++) {
                if (Character.isLetter(passwordHere.charAt(p)))
                    f1 = 1;
            }
            for (int p = 0; p < passwordHere.length(); p++) {
                if (Character.isDigit(passwordHere.charAt(p)))
                    f2 = 1;
            }
            for (int p = 0; p < passwordHere.length(); p++) {
                char c = passwordHere.charAt(p);
                if (c >= 33 && c <= 46 || c == 64)
                    f3 = 1;
            }
            if (f1 == 1 && f2 == 1 && f3 == 1)
                return true;
        }
        return false;
    }
}