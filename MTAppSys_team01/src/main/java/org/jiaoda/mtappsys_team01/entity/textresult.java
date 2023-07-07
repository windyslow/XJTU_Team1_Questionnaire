package org.jiaoda.mtappsys_team01.entity;

public class textresult {
    int question_id;
    String answer_text;

    public int getQuestion_id() {
        return question_id;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }

    textresult(){}

    textresult(int question_id, String answer_text)
    {
        this.answer_text = answer_text;
        this.question_id = question_id;
    }
}
