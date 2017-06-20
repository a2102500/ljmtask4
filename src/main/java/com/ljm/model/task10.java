package com.ljm.model;

import java.io.Serializable;

/**
 * Created by liujm on 2017/6/15.
 */
public class task10 implements Serializable{
    private int id;
    private String name;
    private String title;
    private String body;

    @Override
    public String toString() {
        return "task10{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public task10(int id, String name, String title, String body) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.body = body;
    }

    public task10() {
    }
}
