package app;

public class Verification {

    public void verificationOwnershipAddress(User user){
        if (user.getAddress() != null) {
            System.out.println("Checking if an address belongs to an object: "+"Адреса:  "+ user.getAddress() + " - належить об'єкту User.");
        } else {
            System.out.println("Адреса відсутня у об'єкта User.");
        }
    }
}
