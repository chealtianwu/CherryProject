package com.nohead.cherryproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DBManager {
    DBHelper dbHelper;
    SQLiteDatabase db;
    DBManager(Context context){
        dbHelper = new DBHelper(context);
        db = dbHelper.getWritableDatabase();
    }
    public ArrayList<Question> getQuestion(){
        ArrayList<Question> questions = new ArrayList<Question>();
        Cursor cursor = select();
        cursor.moveToFirst();
        do {
            String _question = cursor.getString(1);
            String option1 = cursor.getString(2);
            String option2 = cursor.getString(3);
            String option3 = cursor.getString(4);
            String option4 = cursor.getString(5);
            int answer = Integer.parseInt(cursor.getString(6));
            Question question = new Question(_question,option1,option2,option3,option4,answer);
            questions.add(question);

        }while (cursor.moveToNext());
        cursor.close();
        return questions;
    }
    public void add(Question question){
        SQLiteDatabase db2 = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("question",question.getQuestion());
        values.put("option1",question.getOption1());
        values.put("option2",question.getOption2());
        values.put("option3",question.getOption3());
        values.put("option4",question.getOption4());
        values.put("answer",question.getAnswer());
        db2.insert("question",null,values);
        db2.close();
    }
    public Cursor select(){
        Cursor cursor = db.rawQuery("select * from question",null);
        return cursor;
    }
    public void delete(int id){
        SQLiteDatabase db2 = dbHelper.getWritableDatabase();
        String _id = Integer.toString(id);
        db2.delete("question","_id = ?",new String[]{_id});
        db2.close();
    }
    public void closeDB(){
        db.close();
    }
}
