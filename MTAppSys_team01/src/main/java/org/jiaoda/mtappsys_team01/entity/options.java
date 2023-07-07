package org.jiaoda.mtappsys_team01.entity;

public class options {
    int option_id;
    int question_id;
    String option_content;

    int counts;

    int value;

    public int getOption_id() {
        return option_id;
    }

    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getOption_content() {
        return option_content;
    }

    public void setOption_content(String option_content) {
        this.option_content = option_content;
    }

    public int getCounts() {
        return counts;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCounts(int count) {
        this.counts = counts;
    }

    public options(){}

    public options(int question_id, String option_content) {
        this.question_id = question_id;
        this.option_content = option_content;
    }

}
