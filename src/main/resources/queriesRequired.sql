use blogdatabase;

SELECT * FROM RegisteredUser WHERE access = 'admin';

SELECT * FROM RegisteredUser WHERE email = 'csabavadasz79@gmail.com';

SELECT nickname, blog_text FROM registereduser inner join blogwritten ON registereduser.ID = blogwritten.user_ID WHERE nickname = 'SumFlow';