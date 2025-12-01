package ie.atu;

public class Main {
    public static void main(String[] args)
    {
        Person firstPerson = new Person("Jimmy", "Athenry", "0879876543");
        System.out.println(firstPerson.toString());

        Customer customer = new Customer("Oisín","Oranmore","0891234567", 66, true );
        System.out.println(customer.toString());

        PreferredCustomer loyalCustomer = new PreferredCustomer("Alan", "Salthill", "0860987654", 55, true, 200, 0.10);
        System.out.println(loyalCustomer.toString());

        System.out.println("\nBefore Customer Points: \n");
        loyalCustomer.setName("Andrew");
        loyalCustomer.setAddress("Loughrea");
        loyalCustomer.setPhoneNumber("0834576893");
        loyalCustomer.setCustomerNumber(88);
        loyalCustomer.setMailingList(true);
        System.out.println(loyalCustomer);

        System.out.println("\nAfter Customer Points: \n");
        loyalCustomer.addLoyaltyPoints(700);
        loyalCustomer.getLoyaltyPoints();
        loyalCustomer.getDiscountLevel();
        System.out.println(loyalCustomer);

    }
}
