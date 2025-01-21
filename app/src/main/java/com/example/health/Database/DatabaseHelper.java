package com.example.health.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {


    String TableName ="abebe";
    String TableName1 ="abebe1";
    String Id="id";
    String Name ="name";
    String Age= "age";
    String Weight= "weight";
    String Height= "height";
    String Bmi= "bmi";


    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int dbversion) {
        super(context, name , factory, dbversion);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String Create_table= "CREATE TABLE "+TableName+" ("+Id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+Name+" TEXT, "+Age+" INTEGER, "+Weight+" TEXT, "+Height+" TEXT)";
        db.execSQL(Create_table);
String Create_table1= "CREATE TABLE "+TableName1+" ("+Id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+Bmi+" TEXT)";
        db.execSQL(Create_table1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void addName(String name , String weight, String height, int age){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(Name, name);
        values.put(Age, age);
        values.put(Weight, weight);
        values.put(Height, height);

        db.insert(TableName, null, values);
        db.close();
    }

    public String getUser(){
        String result ="";
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor c=  db.rawQuery("SELECT * FROM "+ TableName, null);
        while (c.moveToNext()){

            String rsname= c.getString(1);
            int rsage= c.getInt(2);
            String rsweight= c.getString(3);
            String rsheight= c.getString(4);
            result = " " + rsname +" - "+ rsage +" - "+ rsweight +" - "+ rsheight +"\n";
        }
        return result;
    }

    public String getBmi(){
        String result ="";
        SQLiteDatabase db= this.getReadableDatabase();
        Cursor c=  db.rawQuery("SELECT * FROM "+ TableName, null);
        while (c.moveToNext()){

            String bmi= c.getString(1);

            result = " - "+ bmi +"\n";
        }
        return result;
    }

    public void addBmi(String bmi) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(Bmi, bmi);
        db.insert(TableName1, null, values);
        db.close();

    }
}
