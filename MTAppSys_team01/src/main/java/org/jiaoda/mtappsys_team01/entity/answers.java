package org.jiaoda.mtappsys_team01.entity;

public class answers {
    int answer_id;
    int response_id;
    int question_id;
    String answer_text;
    int selected_option_id;

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public int getResponse_id() {
        return response_id;
    }

    public void setResponse_id(int response_id) {
        this.response_id = response_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }

    public int getSelected_option_id() {
        return selected_option_id;
    }

    public void setSelected_option_id(int selected_option_id) {
        this.selected_option_id = selected_option_id;
    }
}
