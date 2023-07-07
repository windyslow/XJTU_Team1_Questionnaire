package org.jiaoda.mtappsys_team01.entity;
import java.util.List;
import org.jiaoda.mtappsys_team01.entity.choice;

public class quesopt {
    String title;
    String type;
    List<choice> choices;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<choice> getChoices() {
        return choices;
    }

    public void setChoices(List<choice> choices) {
        this.choices = choices;
    }

    public quesopt(){}
    public quesopt(String title, String type, List<choice> choices) {
        this.title = title;
        this.type = type;
        this.choices = choices;
    }
}
