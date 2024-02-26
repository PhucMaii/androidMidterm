package com.example.midtermapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TableLayout tableContainer;
    Button addButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> todos = TodoList.getInstance().getItems();

        tableContainer = findViewById(R.id.tableContainer);
        addButton = findViewById(R.id.addButton);

        for (String todo : todos) {
            TableRow tableRow = new TableRow(this);

            TextView textView = new TextView(this);

            textView.setText(todo);

            tableRow.addView(textView);
            tableContainer.addView(tableRow);
        }

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddActivity.class));
            }
        });
    }

}