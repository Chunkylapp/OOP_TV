package user;

import java.util.ArrayList;

public class StandardUser implements UserInterface {

    private String name;
    private String passowrd; //xxhash mfs
    private boolean premium;
    private String country;
    private int balance;
    private int tokensCount;
    private int numFreePremiumMovies;
    // new array list of strings for premium movies
    private ArrayList<String> purchasedMovies;
    private ArrayList<String> watchedMovies;
    private ArrayList<String> likedMovies;
    private ArrayList<String> ratedMovies;

    public StandardUser(String name, String passowrd, String country, int balance) {
        this.name = name;
        this.passowrd = passowrd;
        this.premium = false;
        this.country = country;
        this.balance = balance;
        this.tokensCount = tokensCount;
        this.numFreePremiumMovies = 0;
        purchasedMovies = new ArrayList<String>();
        watchedMovies = new ArrayList<String>();
        likedMovies = new ArrayList<String>();
        ratedMovies = new ArrayList<String>();
    }

    public StandardUser() {
        this.name = "";
        this.passowrd = "";
        this.premium = false;
        this.country = "";
        this.balance = 0;
        this.tokensCount = 0;
        this.numFreePremiumMovies = 0;
        purchasedMovies = new ArrayList<String>();
        watchedMovies = new ArrayList<String>();
        likedMovies = new ArrayList<String>();
        ratedMovies = new ArrayList<String>();
    }


    @Override
    public String getName() {
        return name;
    }


    @Override
    public boolean getPremium() {
        return premium;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public int getTokensCount() {
        return tokensCount;
    }

    @Override
    public int getNumFreePremiumMovies() {
        return numFreePremiumMovies;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPassword(String password) {
        this.passowrd = password;
    }

    @Override
    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void setTokensCount(int tokensCount) {
        this.tokensCount = tokensCount;
    }

    @Override
    public void setNumFreePremiumMovies(int numFreePremiumMovies) {
        this.numFreePremiumMovies = numFreePremiumMovies;
    }

    @Override
    public boolean comparePassHash(String hashedPass) {
        return hashedPass.equals(passowrd);
    }

    public void addPurchasedMovie(String movieName) {
        purchasedMovies.add(movieName);
    }

    public void addWatchedMovie(String movieName) {
        watchedMovies.add(movieName);
    }

    public void addLikedMovie(String movieName) {
        likedMovies.add(movieName);
    }

    public void addRatedMovie(String movieName) {
        ratedMovies.add(movieName);
    }

    public void userToJSON() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "Name: " + name
                + " Premium: " + premium
                + " Country: " + country
                + " Balance: " + balance
                + " Tokens: " + tokensCount
                + " Premium Movies: " + numFreePremiumMovies;
    }
}
