package module;

import database.connection.SingletonConnection;
import database.controller.DatabaseController;
import database.model.AccessEnum;
import database.model.RegisteredUser;
import util.Print;
import util.TxtReader;

import java.util.List;

public class Processor {

    public void run() {

        DatabaseController controller = new DatabaseController();

        Print print = new Print();

        new TxtReader().readTxt();

        print.printText(new CopyRight().addingCopyright());

        SingletonConnection.getInstance();

        List<RegisteredUser> registeredUsers = controller.selectAllRegUser();
        print.printText(registeredUsers.toString());

        String password = controller.updatePassword();
        System.out.println(password);

        List<RegisteredUser> usersByAccess = controller.selectRegUserByAccess(AccessEnum.admin);

        print.printText(usersByAccess.toString());

        RegisteredUser userByEmail = controller.selectRegUserByAccess("csabavadasz79@gmail.com");

        print.printText(userByEmail.toString());

        /*List<String> blogText = controller.showUserAllBlogs("SumFlow");
        print.printText(blogText.toString());*/

        print.printText(CopyRight.addingMessage(CopyRight.MESSAGE));
    }
}
