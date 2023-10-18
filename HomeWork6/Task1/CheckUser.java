package HomeWork6.Task1;



public class CheckUser {
    public static void main(String[] args) {
        User user1 = new User("User1", "password123");
        User user2 = new User("User2");
        User user3 = new User();

        user1.setAge(30);
        user2.setAge(25);
        user3.setAge(35);

        user1.setEmail("user1@example.com");
        user2.setEmail("user2@example.com");
        user3.setEmail("user3@example.com");

        user1.makePurchase(100.0);
        user2.makePurchase(50.0);
        user3.makePurchase(75.0);

        user1.printTotalAmountOfSpentMoney();
        user2.printTotalAmountOfSpentMoney();
        user3.printTotalAmountOfSpentMoney();
    }





}
