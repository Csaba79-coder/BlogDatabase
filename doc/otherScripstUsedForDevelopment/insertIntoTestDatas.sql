insert into RegisteredUser(firstname, familyname, nickname, email, access) value("Csaba", "Vadasz", "Csaba79-coder", "csabavadasz79@gmail.com", "admin");

insert into RegisteredUser(firstname, familyname, nickname, email, access) value("Flora", "Sumegi", "SumFlow", "flora@flora.hu", "moderator");

insert into RegisteredUser(firstname, familyname, nickname, email, access) value("Soma", "Bartfai", "Soma", "soma@progmatic.com", "user");

insert into BlogWritten(user_ID, blog_text) value(2, "Hello, I am the second user and this is my first blog entry!");

insert into BlogWritten(user_ID, blog_text) value(3, "Hello, I am the third user and this is my first blog entry!");

insert into BlogWritten(user_ID, blog_text) value(2, "Hello, I am the second user and this is my second blog entry!");

insert into CommentBlog(blog_ID, comment_reply_ID, user_ID, comment_text) value (1, 1, 3, "Hello! Welcome in Csaba79-coder's DATABASE! You are the first blogger with first blog! First comment");

insert into CommentBlog(blog_ID, comment_reply_ID, user_ID, comment_text) value (2, 1, 2, "Hello! Welcome in Csaba79-coder's DATABASE! You are the second blogger with second blog! First comment!");

insert into CommentBlog(blog_ID, comment_reply_ID, user_ID, comment_text) value (2, 2, 1, "Hello! Welcome in Csaba79-coder's DATABASE! You are the second blogger with second blog! Second comment!");