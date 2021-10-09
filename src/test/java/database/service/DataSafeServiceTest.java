package database.service;

import org.junit.Assert;
import org.junit.Test;

public class DataSafeServiceTest {

    DataService service = new DataService() {
        public String transferDataForSafe() {
            return null;
        }

        @Override
        public String transferDataForSafe(String data) {
            return "MD5('" + data + "')";
        }
    };

    @Test
    public void transferDataForSafeTest() {
        String expected = "MD5('alma')";
        String result = service.transferDataForSafe("alma");
        Assert.assertEquals(expected, result);
    }
}