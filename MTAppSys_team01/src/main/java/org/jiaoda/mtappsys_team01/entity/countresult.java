package org.jiaoda.mtappsys_team01.entity;

public class countresult {
    int question_id;
    int value;
    int counts;

    public int getQuestion_id() {
        return question_id;
    }

    public int getValue() {
        return value;
    }

    public int getCounts() {
        return counts;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public countresult(){}

    public countresult(int question_id, int value, int counts)
    {
        this.counts = counts;
        this.value = value;
        this.question_id = question_id;
    }


}
