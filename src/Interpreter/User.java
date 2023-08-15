package Interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class User {
    private List<String> permissions;
    private String username;

    public User(final String username, String... permissions) {
        this.username = username;
        this.permissions=new ArrayList<>();
        Stream.of(permissions).forEach(string->this.permissions.add(string.toLowerCase()));
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getUsername() {
        return username;
    }
}
