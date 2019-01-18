package co.com.bancolombia.dojoinjectmocksexercise.fakelibraries;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public static boolean save (String name) {
        return true;
    }

    public boolean delete (String id) {
        return true;
    }

    public String findOne (String id) {
        return "Real findOne";
    }

    public List<String> findAll () {
        List<String> listUsers = new ArrayList<>();
        listUsers.add("User1");
        listUsers.add("User2");
        listUsers.add("User3");
        listUsers.add("User4");
        return listUsers;
    }
}
