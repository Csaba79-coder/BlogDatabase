package database.model;

import database.service.DataSafeService;
import database.service.DataService;

import java.sql.Timestamp;

public class RegisteredUser {

    long ID;
    String firstName;
    String familyName;
    String nickName;
    String password;
    String email;
    AccessEnum accessEnum;
    Timestamp regTime;


    public RegisteredUser() {
    }

    public RegisteredUser(long ID, String firstName, String familyName, String nickName,
                          String password, String email, AccessEnum accessEnum, Timestamp regTime) {
        this.ID = ID;
        this.firstName = firstName;
        this.familyName = familyName;
        this.nickName = nickName;
        this.password = new DataSafeService() {
            public String transferDataForSafe() {
                return password;
            }
        }.transferDataForSafe(password);
        this.email = email;
        this.accessEnum = accessEnum;
        this.regTime = regTime;
    }

    public RegisteredUser(long id, String firstName, String familyName, String nickName, String password,
                          String email, String valueOf, Timestamp regTime) {
    }

    @Override
    public String toString() {
        return "RegisteredUser{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", accessEnum=" + accessEnum +
                ", regTime=" + regTime +
                '}';
    }

    public long getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccessEnum getAccessEnum() {
        return accessEnum;
    }

    public void setAccessEnum(AccessEnum accessEnum) {
        this.accessEnum = accessEnum;
    }

    public Timestamp getRegTime() {
        return regTime;
    }

    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }
}
