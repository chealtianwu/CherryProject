package com.nohead.cherryproject;

public class Question {
    String question;
    String option1,option2,option3,option4;
    int answer;
    Question(){

    }
    Question(String _question,String _option1,String _option2,String _option3,String _option4,int _answer){
        question = _question;
        option1 = _option1;
        option2 = _option2;
        option3 = _option3;
        option4 = _option4;
        answer = _answer;
    }
}
