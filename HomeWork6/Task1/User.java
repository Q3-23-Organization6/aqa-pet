package HomeWork6.Task1;

public class User {

    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpentMoney;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName != null && !userName.isEmpty()) {
            this.userName = userName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password != null && password.length() >= 6) {
            this.password = password;
        }
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public double getAmountSpentMoney() {
        return amountSpentMoney;
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Purchase price: " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Total amount of spent money: " + amountSpentMoney);
    }
}
