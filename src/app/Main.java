package app;

public class Main {

    public static void main(String[] args) {
        Verification verification = new Verification();
        User user = new User("Vovan");
        Address address = new Address("Voloshkova", "5a");
        user.setAddress(address);
        user.printAddress();
        System.out.println("Address changed");
        Address newAddress = new Address("Voloshkova123", "3a");
        user.setAddress(newAddress);
        user.printAddress();
        verification.verificationOwnershipAddress(user);
    }
}
