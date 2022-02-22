package com.androidpprog2.com.model;

public class Question {
    private int text_id;
    private Boolean answer;

    public Question(int q, Boolean answer) {
        this.text_id = q;
        this.answer = answer;
    }

    public int getText_id() {
        return text_id;
    }

    public Boolean getAnswer() {
        return answer;
    }
}
