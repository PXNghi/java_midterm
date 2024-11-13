package com.example.practiceproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShowInformation extends AppCompatActivity {
    TextView usernameText;
    TextView passwordText;
    Button btnNavLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_show_information);
        usernameText = findViewById(R.id.usernameShow);
        passwordText = findViewById(R.id.passwordShow);
        btnNavLogin = findViewById(R.id.btnNavLogin);

        Intent intent = getIntent();
        usernameText.setText(intent.getExtras().getString("Username"));
        passwordText.setText(intent.getExtras().getString("Password"));

        btnNavLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowInformation.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}