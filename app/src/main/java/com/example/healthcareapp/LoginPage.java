package com.example.healthcareapp;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    private EditText ed1,ed2;
    private Button btn;
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        ed1=findViewById(R.id.editTextLoginUsername);
        ed2=findViewById(R.id.editTextLoginPassword);
        btn=findViewById(R.id.loginButton);
        txt=findViewById(R.id.textViewLoginNewUser);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;
                username = ed1.getText().toString();
                password = ed2.getText().toString();
                if (username.length()==0 || password.length()==0)
                    Toast.makeText(LoginPage.this, "Hãy điền đầy đủ tài khoản mật khẩu", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                }
            }
        });

        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginPage.this,RegisterPage.class));
            }
        });
    }

}