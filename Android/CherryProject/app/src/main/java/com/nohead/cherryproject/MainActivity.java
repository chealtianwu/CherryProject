package com.nohead.cherryproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ac, pwd;
    Button studnetButton, teacherButton;
    DBManager mgr;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ac = findViewById(R.id.account);
        pwd = findViewById(R.id.password);
        studnetButton = findViewById(R.id.loginstudent);
        teacherButton = findViewById(R.id.loginteacher);
        studnetButton.setOnClickListener(new mainClick());
        teacherButton.setOnClickListener(new mainClick());
    }

    class mainClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v == studnetButton) {

                    intent = new Intent();
                    intent.setClass(MainActivity.this, StudentActivity.class);

            }else if (v == teacherButton) {
                    intent = new Intent();
                    intent.setClass(MainActivity.this, TeacherActivity.class);
            }
            startActivity(intent);
        }
    }
}
