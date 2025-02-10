package Day4;

public class Customer {
    //data member
    private String CustomerName;
    private int CustomerId;
    private String CustomerCity;

    public Customer(String Name,int id,String city){
        this.CustomerName = Name;
        this.CustomerId = id;
        this.CustomerCity = city;
    }
    public String getCustomerName() {
        return CustomerName;
    }
    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
    public int getCustomerId(){
        return CustomerId;
    }
    public void setCustomerId(int id){
        CustomerId = id;
    }
    public String getCustomerCity() {
        return CustomerCity;
    }
    public void setCustomerCity(String customerCity) {
        CustomerCity = customerCity;
    }
}
