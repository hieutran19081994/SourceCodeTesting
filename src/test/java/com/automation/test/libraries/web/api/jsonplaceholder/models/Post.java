package com.automation.test.libraries.web.api.jsonplaceholder.models;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;

    public Post() {}

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() { return userId; }
    public void setUserId(int userID) { this.userId = userID; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getBody() { return body; }
    public void setBody() { this.body = body; }

    @Override
    public String toString() {
        return "Post [userID:" + userId + ", id:" + id + ", title:"
                + title + ", body:" + body + "]";
    }
}
