package ie.atu;


public class Person {
private String name;
private String address;
private String phoneNumber;

    public Person() {
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public Person(String phoneNumber, String address, String name) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber;
    }
}
