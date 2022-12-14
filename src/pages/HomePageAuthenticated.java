package pages;

public class HomePageAuthenticated implements PageInterface {

    private static HomePageAuthenticated instance;
    private String name;

    HomePageAuthenticated(String name) {
        this.name = name;
    }

    public static HomePageAuthenticated getInstance() {
        if (instance == null) {
            instance = new HomePageAuthenticated("HomePageAuthenticated");
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean action(String feature, String[] args) {
        // home page authenticated does not have any features
        return false;
    }
}
