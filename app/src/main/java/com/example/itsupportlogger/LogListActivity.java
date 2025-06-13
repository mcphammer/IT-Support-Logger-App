package com.example.itsupportlogger;


import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Intent;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LogListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LogAdapter adapter;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            finish();
        });
        dbHelper = new DatabaseHelper(this);

        SharedPreferences prefs = getSharedPreferences("user_prefs", MODE_PRIVATE);
        int userId = prefs.getInt("user_id", -1);

        List<LogEntry> logs = dbHelper.getLogsByUser(userId);
        adapter = new LogAdapter(logs);
        recyclerView.setAdapter(adapter);
    }
}
