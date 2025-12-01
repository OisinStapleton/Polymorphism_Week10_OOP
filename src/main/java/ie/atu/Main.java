package ie.atu;

public class Main {
    public static void main(String[] args)
    {
        Person firstPerson = new Person("Jimmy", "Athenry", "0879876543");
        System.out.println(firstPerson.toString());

        Customer customer = new Customer("Oisín","Oranmore","0891234567", 66, true );
        System.out.println(customer.toString());

        PreferredCustomer loyalCustomer = new PreferredCustomer("Alan", "Salthill", "0860987654", 55, true, 400, 0.10);
        System.out.println(loyalCustomer.toString());


    }
}
