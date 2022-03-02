package com.example.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    customer cust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //reference to buttons and other controls
        Button addbutton,viewbutton;
        EditText name,age;
        Switch switch1;
        ListView list1;
         name=findViewById(R.id.name);
         age=findViewById(R.id.age);
        switch1=findViewById(R.id.switch1);
        viewbutton=findViewById(R.id.button1);
        addbutton=findViewById(R.id.button2);
        list1=findViewById(R.id.list);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    customer custo=new customer(1,name.getText().toString(),Integer.parseInt(age.getText().toString()),switch1.isChecked());
                   // Toast.makeText(MainActivity.this,custo.toString(),Toast.LENGTH_SHORT).show();
                    Database db=new Database(MainActivity.this);
                    Boolean success=db.add1(cust);
                    Toast.makeText(MainActivity.this,"success",Toast.LENGTH_SHORT).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
                    Database db=new Database(MainActivity.this);
                    Boolean success=db.add1(cust);
                    Toast.makeText(MainActivity.this,"success",Toast.LENGTH_SHORT).show();
                }

            }

        });
        viewbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"View",Toast.LENGTH_SHORT).show();

            }

        });


        }
    }
