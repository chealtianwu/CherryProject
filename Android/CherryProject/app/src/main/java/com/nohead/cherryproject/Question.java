package com.nohead.cherryproject;

public class Question {
    int _id;
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
    String getQuestion(){
        return question;
    }
    String getOption1(){
        return option1;
    }
    String getOption2(){
        return option2;
    }
    String getOption3() {
        return option3;
    }
    String getOption4(){
        return option4;
    }
    int getAnswer(){
        return answer;
    }
    void setQuestion(String question){
        this.question = question;
    }
    void setOption1(String option){
        this.option1 = option;
    }
    void setOption2(String option){
        this.option2 = option;
    }
    void setOption3(String option){
        this.option3 = option;
    }
    void setOption4(String option){
        this.option4 = option;
    }
    void setAnswer(int answer){
        this.answer = answer;
    }
}
