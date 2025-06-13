package com.example.itsupportlogger;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editDate, editProblem, editAction, editResolution;
    Button btnSave, btnViewLogs;
    com.example.itsupportlogger.DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDate = findViewById(R.id.editDate);
        editProblem = findViewById(R.id.editProblem);
        editAction = findViewById(R.id.editActions);
        editResolution = findViewById(R.id.editResolution);
        btnSave = findViewById(R.id.btnSave);
        btnViewLogs = findViewById(R.id.btnViewLogs);

        dbHelper = new com.example.itsupportlogger.DatabaseHelper(this);

        btnSave.setOnClickListener(v -> {
            String date = editDate.getText().toString();
            String problem = editProblem.getText().toString();
            String action = editAction.getText().toString();
            String resolution = editResolution.getText().toString();

            SharedPreferences prefs = getSharedPreferences("user_prefs", MODE_PRIVATE);
            int userId = prefs.getInt("user_id", -1);

            if (userId != -1) {
                boolean success = dbHelper.insertLog(date, problem, action, resolution, userId);
                Toast.makeText(MainActivity.this,
                        success ? "Log saved!" : "Error saving log.",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "User not logged in", Toast.LENGTH_SHORT).show();
            }
        });
        btnViewLogs.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, LogListActivity.class));
        });
    }
}