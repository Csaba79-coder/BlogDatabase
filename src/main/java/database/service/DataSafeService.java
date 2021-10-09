package database.service;

public class DataSafeService implements DataService {

    public String transferDataForSafe(String data) {
        return "MD5('" + data + "')";
    }
}
