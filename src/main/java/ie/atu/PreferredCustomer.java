package ie.atu;

public class PreferredCustomer extends Customer
{
    private int loyaltyPoints;
    private double discountLevel; // 0.05 (5%)

    public PreferredCustomer()
    {
        super();
        this.loyaltyPoints = 100;
        this.discountLevel = 0.10; // 10%
    }

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel){
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;

    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel;

    }
}
