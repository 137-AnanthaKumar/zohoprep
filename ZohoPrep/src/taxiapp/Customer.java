package taxiapp;

public class Customer {

    
    private String cusId;
    private String cusName;
    public Customer() {
        
    }
    public Customer(String cusId, String cusName, float totalSpend) {
        super();
        this.cusId = cusId;
        this.cusName = cusName;
        this.totalSpend = totalSpend;
    }
    public String getCusId() {
        return cusId;
    }
    public void setCusId(String cusId) {
        this.cusId = cusId;
    }
    public String getCusName() {
        return cusName;
    }
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public float getTotalSpend() {
        return totalSpend;
    }
    public void setTotalSpend(float totalSpend) {
        this.totalSpend = totalSpend;
    }
    private float totalSpend;
    
}
