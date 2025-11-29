package ie.atu;

public class Main {
    public static void main(String[] args)
    {
        Person firstPerson = new Person();
        firstPerson.setName("Oisín");
        firstPerson.setAddress("Oranmore");
        firstPerson.setPhoneNumber("0891234567");

        System.out.println(firstPerson.toString());
    }
}
