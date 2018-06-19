package com.nohead.cherryproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "cherryproject.db", null, 1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table account(_id Integer primary key autoincrement,account text not null,password text not null,style integer not null)");
        //style 标记账户类型，0为教师，1为学生
        db.execSQL("Create table question(_id Integer primary key autoincrement,question text not null,option1 text not null,option2 text not null," +
                "option3 text not null,option4 text not null,answer Integer not null)");
        //answer 1，2，3，4分别为ABCD；
        ContentValues values = new ContentValues();
        values.put("account","admin");
        values.put("password","root");
        values.put("style","0");
        db.insert("account",null,values);
    }
}
