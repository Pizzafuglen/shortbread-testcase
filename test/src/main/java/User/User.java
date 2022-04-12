package User;

public class User {
    private String userName;
    private String userPass;
    private double userBalance;

    public User(String userName, String userPass, double userBalance) {
        this.userName = userName;
        this.userPass = userPass;
        this.userBalance = userBalance;
    }

    public double getUserBalance() {
        return this.userBalance;
    }

    public String getUserPass() {
        return this.userPass;
    }

    public String getUserName() {
        return this.userName;
    }
}
