package database.model;

import java.sql.Timestamp;

public class BlogWritten {

    long ID;
    long userID;
    String blogSchemasName;
    BlogColorEnum blogColorEnum;
    String text;
    Timestamp entryTime;

    public BlogWritten() {
    }

    public BlogWritten(long ID, long userID, String blogSchemasName, BlogColorEnum blogColorEnum, String text, Timestamp entryTime) {
        this.ID = ID;
        this.userID = userID;
        this.blogSchemasName = blogSchemasName;
        this.blogColorEnum = blogColorEnum;
        this.text = text;
        this.entryTime = entryTime;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getBlogSchemasName() {
        return blogSchemasName;
    }

    public void setBlogSchemasName(String blogSchemasName) {
        this.blogSchemasName = blogSchemasName;
    }

    public BlogColorEnum getBlogColorEnum() {
        return blogColorEnum;
    }

    public void setBlogColorEnum(BlogColorEnum blogColorEnum) {
        this.blogColorEnum = blogColorEnum;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }
}
