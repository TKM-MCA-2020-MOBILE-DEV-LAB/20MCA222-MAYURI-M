package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        TextView display=findViewById(R.id.t1);
        Bundle bd=i.getExtras();
        String info=(String)  bd.get("key");
        display.setText(info);


    }
}