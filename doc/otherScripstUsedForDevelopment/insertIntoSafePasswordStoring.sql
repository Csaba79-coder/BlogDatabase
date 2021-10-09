use blogdatabase;

INSERT INTO RegisteredUser (firstname, familyname, nickname, password, email) VALUE('Nick', 'Name', 'NickName', md5('1234'), 'nick@nick.co.uk');

UPDATE RegisteredUser SET password = md5('1234') WHERE email = 'csabavadasz79@gmail.com';