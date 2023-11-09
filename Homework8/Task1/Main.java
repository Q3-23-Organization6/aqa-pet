package Homework8.Task1;

public class Main {
    public static void main(String[] args) {
        Model myPhone = new Model("Iphone X");
        myPhone.print(myPhone);
        myPhone.checkBatteryLevel();
        myPhone.call("123-456-7890");
        myPhone.sendMessage("123-456-7890", "Hello there!");
        myPhone.checkBatteryLevel();
    }
}
