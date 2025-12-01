package ie.atu;

public class PreferredCustomer extends Customer
{
    private int loyaltyPoints;
    private double discountLevel; // 0.05 (5%)

    public PreferredCustomer()
    {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0; // 0.10 = 10%
    }

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints, double discountLevel){
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
        updateDiscountLevel();
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
    }
    private void updateDiscountLevel() {
        if(loyaltyPoints<500)
        {
            discountLevel = 0.0;
        }
        else if(loyaltyPoints>500 && loyaltyPoints<999)
        {
            discountLevel = 0.05; // 5% discount
        }
        else if(loyaltyPoints>1000 && loyaltyPoints<1499)
        {
            discountLevel = 0.06; // 6% discount
        }
        else if(loyaltyPoints>1500 && loyaltyPoints<1999)
        {
            discountLevel = 0.07; // 7% discount
        }
        else if(loyaltyPoints>=2000)
        {
            discountLevel = 0.10; // 10% discount
        }
    }

    public void addLoyaltyPoints(int points)
    {
        this.loyaltyPoints =  loyaltyPoints + points;
        updateDiscountLevel();
    }


    @Override
    public String toString() {
        return super.toString() + ", loyaltyPoints=" + getLoyaltyPoints() +
                ", discountLevel=" + getDiscountLevel();

    }
}
