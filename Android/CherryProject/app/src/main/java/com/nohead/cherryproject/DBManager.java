package com.nohead.cherryproject;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DBManager {
    DBHelper dbHelper;
    SQLiteDatabase db;
    DBManager(Context context){
        dbHelper = new DBHelper(context);
        db = dbHelper.getWritableDatabase();
    }
    public void closeDB(){
        db.close();
    }
}
