package com.example.health.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper1 extends SQLiteOpenHelper {


    String TableName ="abebe";
    String TableName1 ="abebe1";
    String Id="id";

    String Bmi= "bmi";


    public DatabaseHelper1(Context context, String name, SQLiteDatabase.CursorFactory factory, int dbversion) {
        super(context, name , factory, dbversion);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        String Create_table1= "CREATE TABLE "+TableName1+" ("+Id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+Bmi+" TEXT)";
        db.execSQL(Create_table1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

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
