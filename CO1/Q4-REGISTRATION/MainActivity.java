package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Objects;
public class MainActivity extends AppCompatActivity { EditText Name;
    EditText address;
    EditText email;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.E1);
        address = findViewById(R.id.E2);
        email = findViewById(R.id.E3);
        register = findViewById(R.id.B1);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello "+Name .getText().toString()
                        +"\n"+"Your Address is "+address .getText().toString()
                        +"\n"+" Your Email is "+email .getText().toString(),Toast.LENGTH_LONG).show();


            }
        });
    }
}
