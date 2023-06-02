package Uppgift6;

public class Main {
    public static void main(String[] args) {

        var customer = new Customer("Johan", "satan@666.hell", "031-1337");
        var shop = new Shop();

        shop.sendInvoid(customer);

    }
}
