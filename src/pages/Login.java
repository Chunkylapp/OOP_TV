package pages;

import user.UserInterface;

public class Login implements PageInterface {

    private static Login instance;
    private String name;

    private Login(String name) {
        this.name = name;
    }

    public static Login getInstance() {
        if (instance == null) {
            instance = new Login("Login");
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public boolean action(String feature, String[] args) {
        // login only has one feature so feature is not used
        if(args.length < 2)
            return false;
        // args[0] contains the name
        // args[1] contains the password
        UserInterface user = dataBase.DataBase.getUser(args[0]);
        if(user == null)
            return false;
        return user.comparePassHash(args[1]);
    }
}
