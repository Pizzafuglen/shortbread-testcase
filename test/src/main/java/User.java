public class User {
    private String userPass;
    private double userBalance;

    public User(String userPass, double userBalance) {
        this.userPass = userPass;
        this.userBalance = userBalance;
    }

    public double getUserBalance() {
        return this.userBalance;
    }

    public String getUserPass() {
        return this.userPass;
    }
}
