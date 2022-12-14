package user;

public interface UserInterface {
    public String getName();

    public boolean getPremium();

    public String getCountry();

    public int getBalance();

    public int getTokensCount();

    public int getNumFreePremiumMovies();

    public void setName(String name);

    public void setPassword(String password);

    public void setPremium(boolean premium);

    public void setCountry(String country);

    public void setBalance(int balance);

    public void setTokensCount(int tokensCount);

    public void setNumFreePremiumMovies(int numPremiumMovies);

    public boolean comparePassHash(String hashedPass);

    public void addPurchasedMovie(String movieName);

    public void addWatchedMovie(String movieName);

    public void addLikedMovie(String movieName);

    public void addRatedMovie(String movieName);

    public void userToJSON();

}
