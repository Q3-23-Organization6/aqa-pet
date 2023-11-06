package Homework8.Task1;

abstract class MobilePhone implements Mobile {
    protected Battery battery;

    public MobilePhone() {
        battery = new Battery();
    }

    @Override
    public void checkBatteryLevel() {
        System.out.println("Battery level: " + battery.getLevel() + "%");
    }

    @Override
    public void call(String phoneNumber) {
        if (battery.getLevel() > 0) {
            System.out.println("Calling " + phoneNumber);
            battery.consumeBattery(10);
        } else {
            System.out.println("Low battery. Cannot make a call.");
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {
        if (battery.getLevel() > 0) {
            System.out.println("Sending a message to " + phoneNumber + ": " + message);
            battery.consumeBattery(5);
        } else {
            System.out.println("Low battery. Cannot send a message.");
        }
    }
}
