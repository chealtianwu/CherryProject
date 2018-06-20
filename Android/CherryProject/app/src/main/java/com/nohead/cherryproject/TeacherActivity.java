package com.nohead.cherryproject;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TeacherActivity extends AppCompatActivity {
    EditText tquestion,option1,option2,option3,option4,answer;
    Button tpre,tnext,tadd,tdelete;
    DBManager mgr;
    Cursor cursor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        tquestion = findViewById(R.id.tquestion);
        option1 = findViewById(R.id.toption1);
        option2 = findViewById(R.id.toption2);
        option3 = findViewById(R.id.toption3);
        option4 = findViewById(R.id.toption4);
        answer = findViewById(R.id.tanswer);
        tpre = findViewById(R.id.tpre);
        tnext = findViewById(R.id.tnext);
        tadd = findViewById(R.id.tadd);
        tdelete = findViewById(R.id.tdelete);
        mgr = new DBManager(this);
        cursor = mgr.select();
        tpre.setOnClickListener(new tClick());
        tnext.setOnClickListener(new tClick());
        tadd.setOnClickListener(new tClick());
        tdelete.setOnClickListener(new tClick());
    }
    void show(){
        tquestion.setText(cursor.getString(1));
        option1.setText(cursor.getString(2));
        option2.setText(cursor.getString(3));
        option3.setText(cursor.getString(4));
        option4.setText(cursor.getString(5));
        answer.setText(cursor.getString(6));
    }
    class tClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.tpre:
                    if (!cursor.isFirst()){
                        cursor.moveToPrevious();
                        show();
                    }
                    break;
                case R.id.tnext:
                    if (!cursor.isLast()){
                        cursor.moveToNext();
                        show();
                    }
                    break;
                case R.id.tadd:
                    Question question = new Question();
                    question.setQuestion(tquestion.getText().toString());
                    question.setOption1(option1.getText().toString());
                    question.setOption2(option2.getText().toString());
                    question.setOption3(option3.getText().toString());
                    question.setOption4(option4.getText().toString());
                    question.setAnswer(Integer.parseInt(answer.getText().toString()));
                    mgr.add(question);
                    break;
                case R.id.tdelete:
                    int id = cursor.getInt(0);
                    mgr.delete(id);
                    break;
            }
        }
    }
}
