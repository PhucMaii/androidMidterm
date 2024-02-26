package com.example.midtermapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    Button addButton;
    Button backButton;
    EditText inputTodo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        addButton = findViewById(R.id.addButton);
        backButton = findViewById(R.id.backButton);
        inputTodo = findViewById(R.id.inputTodo);

        String todo = inputTodo.getText().toString();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TodoList.getInstance().addItem(todo);

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(AddActivity.this, "Add Item Successfully", duration);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(AddActivity.this, MainActivity.class));
            }
        });

    }
}