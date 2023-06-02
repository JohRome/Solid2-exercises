package Uppgift6;

public class Shop {
    public void sendInvoid(Customer customer) {
        System.out.println("Hello, dear " + customer.name() + "!\n" +
                "We have tried to reach you on the following email address: " + customer.email() + "without any luck!\n" +
                "Now we will try to phone you on the following number: " + customer.phoneNumber() + "\n" +
                "If we do not succeed, you will be beheaded! Thank you for your understanding");
    }
}
