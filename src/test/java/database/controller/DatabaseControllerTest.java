package database.controller;

import database.model.RegisteredUser;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DatabaseControllerTest {

    DatabaseController controller = new DatabaseController();

    @Test
    public void selectAllRegUserTest() {
        List<RegisteredUser> users = new ArrayList<>();
        int expected = 3;
        int result = controller.selectAllRegUser().size();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void updatePasswordTest() {
        String expected = "user password updated";
        String result = controller.updatePassword();
        Assert.assertEquals(expected, result);
    }
}