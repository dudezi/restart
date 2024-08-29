package org.example;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private int Id;
    private String subject;
    private String content;

    Article (int Id, String subject, String content){
        this.Id = Id;
        this.subject = subject;
        this.content = content;
    }

    public int getId () {
        return Id;
    }
    public String getSubject () {
        return subject;
    }
    public String getContent () {
        return content;
    }

    public void setSubject (String subject) {
        this.subject =subject;
    }
    public void setContent (String content) {
        this.content = content;
    }
}
