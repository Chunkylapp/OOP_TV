package pages;

public class HomePageNotAuthenticated implements PageInterface {

    private String name;
    private static HomePageNotAuthenticated instance;

    private HomePageNotAuthenticated(String name) {
        this.name = name;
    }

    public static HomePageNotAuthenticated getInstance() {
        if (instance == null) {
            instance = new HomePageNotAuthenticated("HomePageNotAuthenticated");
        }
        return instance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean action(String feature, String[] args) {
        // home page not authenticated does not have any features
        return false;
    }
}
