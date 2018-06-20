package com.nohead.cherryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {
    TextView stquestion;
    RadioButton stoption1,stoption2,stoption3,stoption4;
    RadioGroup radioGroup;
    Button stpre,stnext,stup;
    int templeAnswer;
    int indext;
    ArrayList<Integer> studentAnswer;
    ArrayList<Question> questions;
    DBManager mgr;
    int questionsLength;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        stquestion = findViewById(R.id.stquestion);
        stoption1 = findViewById(R.id.stoption1);
        stoption2 = findViewById(R.id.stoption2);
        stoption3 = findViewById(R.id.stoption3);
        stoption4 = findViewById(R.id.stoption4);
        radioGroup = findViewById(R.id.stgroup);
        stpre = findViewById(R.id.stprebutton);
        stnext = findViewById(R.id.stnextbutton);
        stup = findViewById(R.id.stup);
        indext = 0;
        radioGroup.setOnCheckedChangeListener(new radioCheck());
        mgr = new DBManager(this);
        questions = mgr.getQuestion();
        questionsLength = questions.toArray().length;
        studentAnswer = new ArrayList<Integer>(questionsLength);
        for(int i=0;i<questionsLength-1;i++){
            studentAnswer.add(i,0);
        }
        show();
        stpre.setOnClickListener(new studentClick());
        stnext.setOnClickListener(new studentClick());
        stup.setOnClickListener(new studentClick());
    }
    class radioCheck implements RadioGroup.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch(checkedId){
                case R.id.stoption1:
                    templeAnswer = 1;
                    break;
                case R.id.stoption2:
                    templeAnswer = 2;
                    break;
                case R.id.stoption3:
                    templeAnswer = 3;
                    break;
                case R.id.stoption4:
                    templeAnswer = 4;
                    break;
                    default:
                        templeAnswer = 0;
            }
        }
    }
    class studentClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.stprebutton:
                    studentAnswer.add(indext,templeAnswer);
                    if(indext>0)
                    {
                        indext = indext-1;
                        show();
                    }
                    break;
                case R.id.stnextbutton:
                    studentAnswer.add(indext,templeAnswer);
                    if(indext<questionsLength-1)
                    {
                        indext = indext+1;
                        show();
                    }
                    break;
                case R.id.stup:
                    break;
            }
        }
    }
    void show(){
        Question question = questions.get(indext);
        stquestion.setText(question.getQuestion());
        stoption1.setText(question.getOption1());
        stoption2.setText(question.getOption2());
        stoption3.setText(question.getOption3());
        stoption4.setText(question.getOption4());
        switch (studentAnswer.get(indext)){
            case 1:
                stoption1.setChecked(true);
                break;
            case 2:
                stoption2.setChecked(true);
                break;
            case 3:
                stoption3.setChecked(true);
                break;
            case 4:
                stoption4.setChecked(true);
                break;
                default:
                    stoption1.setChecked(false);
                    stoption2.setChecked(false);
                    stoption3.setChecked(false);
                    stoption4.setChecked(false);
        }
    }
}
