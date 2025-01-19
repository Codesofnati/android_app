package com.example.health;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {


    String TableName ="abebe";
    String Id="id";
    String Name ="name";
    String Age= "age";
    String Weight= "weight";
    String Height= "height";
    String Sex= "sex";


    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int dbversion) {
        super(context, name , factory, dbversion);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        String Create_table= "CREATE TABLE "+TableName+" ("+Id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+Name+" TEXT, "+Age+" INTEGER, "+Weight+" TEXT, "+Height+" TEXT)";
        db.execSQL(Create_table);
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
            int rsid= c.getInt(0);
            String rsname= c.getString(1);
            int rsage= c.getInt(2);
            String rsweight= c.getString(3);
            String rsheight= c.getString(4);
            result += rsid +". " + rsname +" - "+ rsage +" - "+ rsweight +" - "+ rsheight +"\n";
        }
        return result;
    }
}
