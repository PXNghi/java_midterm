package com.example.practiceproject;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class BasicListView extends AppCompatActivity {
    ListView listView;
    Button addBtn;
    Button updateBtn;
    EditText editText;
    ArrayList<String> arrayMonHoc = new ArrayList<>();
    int pos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_basic_list_view);
        listView = findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(BasicListView.this, android.R.layout.simple_list_item_1, arrayMonHoc);
        listView.setAdapter(arrayAdapter);

        editText = findViewById(R.id.textInput);
        addBtn = findViewById(R.id.addBtn);
        updateBtn = findViewById(R.id.updateBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayMonHoc.add(editText.getText().toString());
                arrayAdapter.notifyDataSetChanged();
                editText.setText("");
            }
        });

        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pos != -1) {
                    arrayMonHoc.set(pos, editText.getText().toString());
                    arrayAdapter.notifyDataSetChanged();
                }
                pos = -1;
                editText.setText("");
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                editText.setText(arrayMonHoc.get(position));
                pos = position;
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(BasicListView.this, "Long click at " + i, Toast.LENGTH_LONG).show();
                return false;
            }
        });
    }
}