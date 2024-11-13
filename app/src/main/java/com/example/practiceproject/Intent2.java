package com.example.practiceproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Intent2 extends AppCompatActivity implements View.OnClickListener {
    private int[] listButtonID = {R.id.btnCall, R.id.btnEdit, R.id.btnSendMess, R.id.btnShowWeb, R.id.btnView};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intent2);
        init();
    }

    public void init() {
        for(int id : listButtonID) {
            Button btnTemp = (Button) findViewById(id);
            btnTemp.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.btnShowWeb:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://vnexpress.net/"));
                break;
            case R.id.btnCall:
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 0372313948"));
                break;
            case R.id.btnEdit:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://contacts/people/1"));
                break;
            case R.id.btnSendMess:
                intent.setAction(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("sms: 0372313948"));
                break;
            case R.id.btnView:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://contacts/people"));
                break;
        }
        startActivity(intent);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}