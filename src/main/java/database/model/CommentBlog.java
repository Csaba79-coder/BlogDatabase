package database.model;

public class CommentBlog {

    long ID;
    long blogID;
    long commentReplyID;
    long user_ID;
    String textComment;

    public CommentBlog() {
    }

    public CommentBlog(long ID, long blogID, long commentReplyID, long user_ID, String textComment) {
        this.ID = ID;
        this.blogID = blogID;
        this.commentReplyID = commentReplyID;
        this.user_ID = user_ID;
        this.textComment = textComment;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public long getBlogID() {
        return blogID;
    }

    public void setBlogID(long blogID) {
        this.blogID = blogID;
    }

    public long getCommentReplyID() {
        return commentReplyID;
    }

    public void setCommentReplyID(long commentReplyID) {
        this.commentReplyID = commentReplyID;
    }

    public long getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(long user_ID) {
        this.user_ID = user_ID;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }
}
