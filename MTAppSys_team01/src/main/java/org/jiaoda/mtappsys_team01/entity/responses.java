package org.jiaoda.mtappsys_team01.entity;

import java.util.Date;

public class responses {
    int response_id;
    int questionnaire_id;
    int user_id;
    Date response_date;

    public int getResponse_id() {
        return response_id;
    }

    public void setResponse_id(int response_id) {
        this.response_id = response_id;
    }

    public int getQuestionnaire_id() {
        return questionnaire_id;
    }

    public void setQuestionnaire_id(int questionnaire_id) {
        this.questionnaire_id = questionnaire_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getResponse_date() {
        return response_date;
    }

    public void setResponse_date(Date response_date) {
        this.response_date = response_date;
    }
}
