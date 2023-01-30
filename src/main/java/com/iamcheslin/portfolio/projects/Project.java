package com.iamcheslin.portfolio.projects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personalProjects")
public class Project {
    @Id
    private ObjectId id;
    private String title;
    private String url;

    public Project() {
    }

    public Project(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public Project(ObjectId id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
