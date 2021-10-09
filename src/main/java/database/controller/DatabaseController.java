package database.controller;

import database.connection.SingletonConnection;
import database.model.AccessEnum;
import database.model.BlogWritten;
import database.model.DatabaseVariable;
import database.model.RegisteredUser;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class DatabaseController {

    SingletonConnection connection = SingletonConnection.getInstance();
    String selectQuery = "SELECT * FROM ";


    public DatabaseController() {
    }

    public List<RegisteredUser> selectAllRegUser() {
        String query = selectQuery + DatabaseVariable.TABLE_USERS;
        List<RegisteredUser> registeredUsers = new ArrayList<>();

        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                long id = resultSet.getLong("ID");
                String firstName = resultSet.getString("firstname");
                String familyName = resultSet.getString("familyname");
                String nickName = resultSet.getString("nickname");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                AccessEnum access = AccessEnum.valueOf(resultSet.getString("access"));
                Timestamp regTime = resultSet.getTimestamp("reg_time");

                RegisteredUser user = new RegisteredUser(id, firstName, familyName, nickName, password, email, access, regTime);
                registeredUsers.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return registeredUsers;
    }
/*
    UPDATE Customers
    SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
    WHERE CustomerID = 1;*/

    public String updatePassword() {

        String query = "UPDATE RegisteredUser SET password = md5('1234') WHERE email = 'soma@progmatic.com';";

        try {
            Statement statement = connection.getConnection().createStatement();
            int resultSet = statement.executeUpdate(query);
            System.out.println(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "user password updated";
    }

    public List<RegisteredUser> selectRegUserByAccess(AccessEnum accessEnum) {
        List<RegisteredUser> users = new ArrayList<>();
        String access = String.valueOf(accessEnum);
        String query = "SELECT * FROM RegisteredUser WHERE access = '" + access + "';";
        System.out.println(query);

        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                long id = resultSet.getLong("ID");
                String firstName = resultSet.getString("firstname");
                String familyName = resultSet.getString("familyname");
                String nickName = resultSet.getString("nickname");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                access = resultSet.getString("access");
                Timestamp regTime = resultSet.getTimestamp("reg_time");

                RegisteredUser user = new RegisteredUser(id, firstName, familyName, nickName, password, email, access, regTime);
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public RegisteredUser selectRegUserByAccess(String email) {
        String query = "SELECT * FROM RegisteredUser WHERE email = '" + email + "';";
        RegisteredUser user = new RegisteredUser();
        System.out.println(query);

        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                long id = resultSet.getLong("ID");
                String firstName = resultSet.getString("firstname");
                String familyName = resultSet.getString("familyname");
                String nickName = resultSet.getString("nickname");
                String password = resultSet.getString("password");
                email = resultSet.getString("email");
                AccessEnum access = AccessEnum.valueOf(resultSet.getString("access"));
                Timestamp regTime = resultSet.getTimestamp("reg_time");

                user = new RegisteredUser(id, firstName, familyName, nickName, password, email, access, regTime);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<String> showUserAllBlogs(String nickname) {
        List<String> blogs = new ArrayList<>();
        String query = "SELECT nickname, blog_text FROM registereduser inner join blogwritten ON registereduser.ID = blogwritten.user_ID WHERE nickname = '" + nickname + "';";
        System.out.println(query);

        try {
            Statement statement = connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                long id = resultSet.getLong("ID");
                long userID = resultSet.getLong("Registered.user_ID");
                long blogID = resultSet.getLong("BlogWritten.user_ID");
                String text = resultSet.getString("blog_text");

                blogs.add(text);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return blogs;
    }
}
