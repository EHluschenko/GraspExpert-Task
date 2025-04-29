package app;

public class User {
    String name;
    Address address;

    User(String name){
        this.name=name;
    }

    public void setAddress(Address address){
        this.address=address;
    }

    public Address getAddress() {
        return address;
    }

    public void printAddress() {
        if (address != null) {
            System.out.println("Address of " + name + ": " + address);
        } else {
            System.out.println("Address not set for user " + name);
        }
    }

    @Override
    public String toString() {
        return "User: " +
                "name='" + name + '\''+" " + address.toString();
    }
}
