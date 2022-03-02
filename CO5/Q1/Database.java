package com.example.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    public static final String Constant = "CUSTOMER";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String AGE = "age";
    public static final String ACTIVEUSER = "activeuser";

    public Database(@Nullable Context context) {
        super(context,"customer.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String store= "CREATE TABLE " + Constant + "(" + ID + " integer primary key autoincrement," + NAME + " text," + AGE + " integer," + ACTIVEUSER + " Boolean)";
                sqLiteDatabase.execSQL(store);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }
        public Boolean add1(customer cust)
                {
                    SQLiteDatabase db1=this.getWritableDatabase();
                    ContentValues cv=new ContentValues();
                    cv.put(NAME,cust.getCustomerName());
                    cv.put(AGE,cust.getAge());
                    cv.put(ACTIVEUSER,cust.isActive());
                    long insert=db1.insert(Constant,null,cv);
                    if(insert==-1)
                    {
                        return false;
                    }
                    else
                    {
                        return true;
                    }

                }

    }

