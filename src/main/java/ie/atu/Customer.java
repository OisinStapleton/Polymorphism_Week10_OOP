package ie.atu;

public class Customer extends Person
{
    // since customer extends person it retains all persons info
    // We only implement code here that is unique to Customer

    private int customerNumber;
    private boolean mailingList;

    public Customer() {
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }

    public Customer(String name,String address,String phoneNumber, int customerNumber, boolean mailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }


    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean getMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + ", customerNumber=" + customerNumber +
                ", mailingList=" + mailingList;
    }
}
