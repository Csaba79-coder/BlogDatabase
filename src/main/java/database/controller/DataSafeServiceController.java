package database.controller;

import database.service.DataSafeService;

public class DataSafeServiceController {

    String password = "alma";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = new DataSafeService() {
            public String transferDataForSafe() {
                return password;
            }
        }.transferDataForSafe(password);
    }
}
