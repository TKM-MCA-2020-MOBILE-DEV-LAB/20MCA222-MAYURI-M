package com.example.arayadapter;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = null;
        //ListView list = findViewById(R.id.list);
        String[] item = new String[]{"Mohanlal", "surya", "vijay", "alluarjun", "mamooty", "nivinpauly", "mukesh", "raju", "dq"};


        TextView textview = null;
        try {
            textview.setText("welcome");
            ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, item);
            list.setAdapter(myAdapter);


        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();

        }

    }
}