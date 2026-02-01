import java.util.ArrayList;

public class Bai6 {
    public static void main(String[] args) {

        User u1 = new User(1, "an", "123");
        User u2 = new User(2, "binh", "456");
        User u3 = new User(3, "chi", "789");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        User found = UserManager.findByUsername("binh");

        if (found != null) {
            System.out.println("Found user: " + found.getUsername());
        } else {
            System.out.println("User not found");
        }
    }
}

class User {
    private final int id;
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}

class UserManager {
    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static User findByUsername(String username) {
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }
}
