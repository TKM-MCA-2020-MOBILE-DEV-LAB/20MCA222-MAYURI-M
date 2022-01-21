package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.bo1);
        b1.setOnClickListener(new OnClickListener() {
            public void onClick(View view)
            {
                EditText edt=(EditText) findViewById(R.id.edit1);
                String value=edt.getText().toString();
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                i.putExtra("key",value);
                startActivity(i);

            }
        });
    }
}