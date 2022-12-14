package dataBase;

import user.UserInterface;

import java.util.ArrayList;

public class DataBase {
    private static ArrayList<UserInterface> users = null;

    // to implement for movies

    public DataBase() {
        users = new ArrayList<UserInterface>();
    }

    public static ArrayList<UserInterface> getUsersInstance() {
        if (users == null) {
            users = new ArrayList<UserInterface>();
        }
        return users;
    }

    public static void addUser(UserInterface user) {
        users.add(user);
    }

    public static void removeUser(UserInterface user) {
        users.remove(user);
    }

    public static void removeUser(String name) {
        for (UserInterface user : users) {
            if (user.getName().equals(name)) {
                users.remove(user);
                break;
            }
        }
    }

    public static UserInterface getUser(String name) {
        for (UserInterface user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public static boolean containsUser(String name) {
        for (UserInterface user : users) {
            if (user.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsUser(UserInterface user) {
        return users.contains(user);
    }

    public static void clear() {
        users.clear();
    }

    public static int size() {
        return users.size();
    }

    public static boolean isEmpty() {
        return users.isEmpty();
    }
}
