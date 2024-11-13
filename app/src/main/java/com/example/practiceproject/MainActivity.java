package com.example.practiceproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practiceproject.fragments.FragmentB;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText usernameInput;
    EditText passwordInput;
    Button btnLogin;
    private int[] listTextButtonID = {R.id.navToIntent2, R.id.navToBaListView, R.id.navToAdvListView,
    R.id.navToAdvGridView, R.id.navToFragment};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowInformation.class);
                intent.putExtra("Username", usernameInput.getText().toString());
                intent.putExtra("Password", passwordInput.getText().toString());
                startActivity(intent);
            }
        });

        init();
    }

    public void init() {
        for (int id : listTextButtonID) {
            TextView tmp = (TextView) findViewById(id);
            tmp.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.navToIntent2:
                intent = new Intent(MainActivity.this, Intent2.class);
                startActivity(intent);
                break;
            case R.id.navToBaListView:
                intent = new Intent(MainActivity.this, BasicListView.class);
                startActivity(intent);
                break;
            case R.id.navToAdvListView:
                intent = new Intent(MainActivity.this, AdvancedListView.class);
                startActivity(intent);
                break;
            case R.id.navToAdvGridView:
                intent = new Intent(MainActivity.this, AdvancedGridView.class);
                startActivity(intent);
                break;
            case R.id.navToFragment:
                intent = new Intent(MainActivity.this, MyFragment.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}